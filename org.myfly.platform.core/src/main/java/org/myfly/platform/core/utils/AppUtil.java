package org.myfly.platform.core.utils;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.starter.ApplicationStarter;
import org.myfly.platform.core3.datamodel.define.FlyDataModel;
import org.myfly.platform.core3.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core3.datamodel.service.IFlyDataModelService;
import org.myfly.platform.core3.flydata.service.IIDNameService;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.util.Assert;

/**
 * 系统AppContext工具类
 * 
 * @author xiangwanhong
 *
 */
public class AppUtil {
	private static ApplicationContext applicationContext;

	/**
	 * 是否在Spring环境中运行
	 * 
	 * @return
	 */
	public static boolean isSpringContext() {
		return applicationContext != null;
	}

	public static ApplicationContext getApplicationConext() {
		AssertUtil.parameterEmpty(applicationContext, "applicationContext", "请确认是在Spring上下文环境中运行.");
		return applicationContext;
	}

	public static void setApplicationConext(ApplicationContext applicationContext) {
		AppUtil.applicationContext = applicationContext;
	}

	public static JpaMetamodelMappingContext getJpaMetamodelMappingContext() {
		return getApplicationConext().getBean(JpaMetamodelMappingContext.class);
	}

	/**
	 * 获取服务
	 * 
	 * @param serviceClass
	 * @return
	 */
	public static <T> T getService(Class<T> serviceClass) {
		return getApplicationConext().getBean(serviceClass);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getService(String beanName) {
		return (T) getApplicationConext().getBean(beanName);
	}

	/**
	 * 获取类型转换服务
	 * 
	 * @return
	 */
	public static ConversionService getConversionService() {
		GenericConversionService conversionService = null;
		try {
			conversionService = (GenericConversionService) getApplicationConext().getBean("mvcConversionService");
		} catch (Exception e) {
		}

		if (conversionService == null) {
			conversionService = new DefaultFormattingConversionService();
			(new ApplicationStarter()).registerConverterFactory(conversionService);
		}
		Assert.notNull(conversionService);
		return conversionService;
	}

	/**
	 * 获取Jpa数据访问服务
	 * 
	 * @return
	 */
	public static IJpaDataAccessService getJpaDataService() {
		return getService(IJpaDataAccessService.class);
	}

	/**
	 * 获取Hibernate SessionFactory
	 * 
	 * @return
	 */
	public static SessionFactory getHibernateSessionFactory() {
		EntityManagerFactory factory = getService(EntityManagerFactory.class);
		if (factory.unwrap(SessionFactory.class) == null) {
			throw new NullPointerException("factory is not a hibernate factory");
		}
		return factory.unwrap(SessionFactory.class);
	}

	/**
	 * 获取实体的数据模型
	 * 
	 * @param entityName
	 * @return
	 */
	public static FlyDataModel getFlyDataModel(String entityName) {
		Assert.hasLength(entityName);
		FlyDataModel metaData = null;
		try {
			IFlyDataModelService emService = null;
			try {
				emService = getService(IFlyDataModelService.class);
				metaData = emService.getFlyDataModel(entityName);
			} catch (Exception e) {
			}
			if (metaData == null) {
				metaData = FlyMemoryDataModel.getInstance().getFlyDataModel(entityName);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("查找数据模型[" + entityName + "]失败，" + e.getMessage());
		}
		Assert.notNull(metaData, "找不到名称为[" + entityName + "]的数据模型");
		return metaData;
	}

	/**
	 * 获取ID名称转换服务
	 * 
	 * @return
	 */
	public static IIDNameService getIDNameService() {
		return getService(IIDNameService.class);
	}
}
