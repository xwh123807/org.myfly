package org.myfly.platform.core.starter;

import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.flydata.config.FlyDataProperties;
import org.myfly.platform.core.metadata.internal.FileMetaDataRegister;
import org.myfly.platform.core.spring.ExtendConvertersRegister;
import org.myfly.platform.core.system.service.IMenuService;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.AssertUtil;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ApplicationStarter implements ApplicationRunner {
	private static Log log = LogFactory.getLog(ApplicationStarter.class);

	private ApplicationContext applicationContext;

	@Autowired
	private FlyDataProperties myFlyDataProperties;

	@Autowired(required=false)
	private List<IAppConfigEvent> appConfigEvents;

	@Autowired
	private FileMetaDataRegister fileMetaDataRegister;

	@Autowired(required=false)
	private IMenuService menuService;

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

		initMicroAppsData();
	}

	public void registerConverterFactory(GenericConversionService conversionService) {
		AssertUtil.parameterEmpty(conversionService, "conversionService");
		ExtendConvertersRegister.registerExtendConverters(conversionService);
	}

	public interface IAppConfigEventExecutor {
		void execute(IAppConfigEvent appConfigEvent);
	}

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
	private void initMicroAppsData() {
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

		// 初始化系统数据
		if (myFlyDataProperties.isInitSysData()) {
			processConfigEvent(new IAppConfigEventExecutor() {
				@Override
				public void execute(IAppConfigEvent appConfigEvent) {
					appConfigEvent.initSysData();
				}
			});
		}

		// 注册微应用扩展元数据模型
		processConfigEvent(new IAppConfigEventExecutor() {
			@Override
			public void execute(IAppConfigEvent appConfigEvent) {
				appConfigEvent.registerExternalMetaData(fileMetaDataRegister);
			}
		});
		// 注册菜单
		processConfigEvent(new IAppConfigEventExecutor() {
			@Override
			public void execute(IAppConfigEvent appConfigEvent) {
				appConfigEvent.registerMenus(menuService);
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
