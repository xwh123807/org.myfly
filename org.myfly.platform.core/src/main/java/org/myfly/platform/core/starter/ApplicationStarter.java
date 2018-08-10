package org.myfly.platform.core.starter;

import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.flydata.config.FlyDataProperties;
import org.myfly.platform.core.spring.ExtendConvertersRegister;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.AssertUtil;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.stereotype.Component;

/**
 * 系统启动类，在SpringBoot启动完成后执行，用于应用的初始化
 * 
 * @author xiangwanhong
 *
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ApplicationStarter implements ApplicationRunner {
	private ApplicationContext applicationContext;

	@Autowired
	private FlyDataProperties myFlyDataProperties;

	@Autowired(required = false)
	private List<IAppConfigEvent> appConfigEvents;

	@Autowired(required = false)
	private CacheManager cacheManager;

	@Autowired(required = false)
	private ICodeLevelDataModelRegister codeLevelDataModelRegister;

	@Autowired(required = false)
	private ICodeLevelModelRegister codeLevelModelRegister;

	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		AppUtil.setApplicationConext(applicationContext);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			GenericConversionService defaultConversionService = (GenericConversionService) applicationContext
					.getBean("defaultConversionService");
			if (defaultConversionService != null) {
				registerConverterFactory(defaultConversionService);
			}

			GenericConversionService mvcConversionService = (GenericConversionService) applicationContext
					.getBean("mvcConversionService");
			if (mvcConversionService != null) {
				registerConverterFactory(mvcConversionService);
			}
		} catch (NoSuchBeanDefinitionException e) {
		}

		showCacheInfo();
		initMicroApps();
	}

	public void registerConverterFactory(GenericConversionService conversionService) {
		AssertUtil.parameterEmpty(conversionService, "conversionService");
		ExtendConvertersRegister.registerExtendConverters(conversionService);
	}

	private void showCacheInfo() {
		if (cacheManager != null) {
			System.out.println("cache implements: " + cacheManager.getClass().getName());
		}
	}

	public interface IAppConfigEventExecutor {
		void execute(IAppConfigEvent appConfigEvent);
	}

	/**
	 * 按顺序启动应用配置插件
	 * 
	 * @param executor
	 */
	private void processConfigEvent(IAppConfigEventExecutor executor) {
		for (AppStartLevel startLevel : AppStartLevel.values()) {
			for (IAppConfigEvent appConfigEvent : appConfigEvents) {
				if (startLevel.equals(appConfigEvent.getAppStartLevel())) {
					executor.execute(appConfigEvent);
				}
			}
		}
	}

	/**
	 * 初始化数据
	 */
	private void initMicroApps() {
		if (CollectionUtils.isEmpty(appConfigEvents)) {
			return;
		}
		appConfigEvents.forEach(new Consumer<IAppConfigEvent>() {

			@Override
			public void accept(IAppConfigEvent event) {
				if (event.getAppStartLevel() == null) {
					throw new RuntimeException("应用配置事件[" + event.getClass().getName() + "]没有配置启动级别.");
				}
			}
		});

		processConfigEvent(new IAppConfigEventExecutor() {
			@Override
			public void execute(IAppConfigEvent appConfigEvent) {
				appConfigEvent.loadCodeLevelDataModels(codeLevelDataModelRegister);
			}
		});

		processConfigEvent(new IAppConfigEventExecutor() {
			@Override
			public void execute(IAppConfigEvent appConfigEvent) {
				appConfigEvent.loadCodeLevelViewModels(codeLevelModelRegister);
				appConfigEvent.loadCodeLevelProcessModels(codeLevelModelRegister);
			}
		});

		// 初始化系统数据
		if (myFlyDataProperties.isInitSysData()) {
			processConfigEvent(new IAppConfigEventExecutor() {
				@Override
				public void execute(IAppConfigEvent appConfigEvent) {
					appConfigEvent.initSysData();
				}
			});
		}

		// 注册菜单
		processConfigEvent(new IAppConfigEventExecutor() {
			@Override
			public void execute(IAppConfigEvent appConfigEvent) {
			}
		});

		// 初始化样例数据
		if (myFlyDataProperties.isInitSampleData()) {
			processConfigEvent(new IAppConfigEventExecutor() {
				@Override
				public void execute(IAppConfigEvent appConfigEvent) {
					appConfigEvent.initSampleData();
				}
			});
		}
	}
}
