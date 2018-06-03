package org.myfly.platform.visualpage.test;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.myfly.platform.VisualPageApplication;
import org.myfly.platform.core.flydata.internal.EntityUtil;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.test.MockMVCTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.ResultActions;

/**
 * 实体Web页测试基类，测试实体
 * 
 * @author xiangwanhong
 *
 */
@SpringBootTest(classes = VisualPageApplication.class)
public abstract class EntityActionsWebPageTestCase<T> extends MockMVCTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;
	
	private T testEntity;

	/**
	 * 获取实体类
	 * 
	 * @return
	 */
	public abstract Class<T> getEntityClass();

	/**
	 * 获取视图名称
	 * 
	 * @return
	 */
	public abstract String getViewName();

	/**
	 * 获取新增实体，用作测试新增，修改、删除
	 * 
	 * @return
	 */
	public abstract T getNewEntity();
	
	/**
	 * 获取新增并保存实体属性值
	 * 
	 * @return
	 */
	public abstract T getSaveAndNewEntity();

	/**
	 * 获取更新实体
	 * 
	 * @return
	 */
	public abstract T getUpdateEntity();

	public String getEntityName() {
		return ClassUtils.getShortClassName(getEntityClass()).toLowerCase();
	}
	
	private T getTestEntity() {
		if (testEntity == null) {
			testEntity = getNewEntity();
		}
		return testEntity;
	}

	/**
	 * 将参数值对转换为HttpRequest参数
	 * 
	 * @param values
	 * @return
	 */
	public String convertToParameters(T entity) {
		String result = "";
		if (entity != null) {
			result = EntityUtil.convertEntityToRequestParameters(entity);
		}
		if (StringUtils.isNotBlank(result)) {
			result = "?" + result;
		}
		return result;
	}

	/**
	 * 获取实体主键
	 * 
	 * @param entity
	 * @return
	 */
	public String getPrimaryKey(T entity) {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(getEntityName());
		return (String) metaData.getPkFieldDefinition().getValueHandler().getFieldValue(entity);
	}

	/**
	 * 显示列表视图
	 * 
	 * @throws Exception
	 */
	@Test
	public void showListView() throws Exception {
		mockMvc.perform(get("/vp/list/" + getEntityName() + "?view=" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 导出到Excel
	 * 
	 * @throws Exception
	 */
	@Test
	public void exportToExcel() throws Exception {
		mockMvc.perform(get("/vp/excel/" + getEntityName() + "?view=" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 显示打印视图
	 * 
	 * @throws Exception
	 */
	@Test
	public void showListPrintView() throws Exception {
		mockMvc.perform(get("/vp/listprint/" + getEntityName() + "?view=" + getViewName())).andExpect(status().isOk());
	}

	@Test
	public void showPrintView() throws Exception {
		mockMvc.perform(
				get("/vp/print/" + getEntityName() + "/" + getPrimaryKey(getTestEntity()) + "?view=" + getViewName()))
				.andExpect(status().isOk());
	}

	/**
	 * 显示查看单个实体视图
	 * 
	 * @throws Exception
	 */
	@Test
	public void showViewEntityView() throws Exception {
		mockMvc.perform(get("/vp/" + getEntityName() + "/" + getPrimaryKey(getTestEntity()) + "?view=" + getViewName()))
				.andExpect(status().isOk());
	}

	/**
	 * 显示新增实体视图
	 * 
	 * @throws Exception
	 */
	@Test
	public void showNewEntityView() throws Exception {
		mockMvc.perform(get("/vp/" + getEntityName() + "?view=" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 保存新增实体
	 * 
	 * @throws Exception
	 */
	@Test
	public void saveNewEntity() throws Exception {
		mockMvc.perform(post("/vp/" + getEntityName() + convertToParameters(getTestEntity())))
				.andExpect(containsAlertTitle("保存成功")).andExpect(status().isOk());
	}

	/**
	 * 保存并新增实体
	 * 
	 * @throws Exception
	 */
	@Test
	public void saveAndNewEntity() throws Exception {
		mockMvc.perform(patch("/vp/" + getEntityName() + convertToParameters(getSaveAndNewEntity())))
				.andExpect(containsAlertTitle("保存成功")).andExpect(status().isOk());
	}

	/**
	 * 修改实体
	 * 
	 * @throws Exception
	 */
	@Test
	public void updateEntity() throws Exception {
		mockMvc.perform(put("/vp/" + getEntityName() + "/" + getPrimaryKey(getTestEntity())
				+ convertToParameters(getUpdateEntity()))).andExpect(containsAlertTitle("保存成功"))
				.andExpect(status().isOk());
	}

	/**
	 * 删除
	 * 
	 * @throws Exception
	 */
	@Test
	public void deleteEntity() throws Exception {

	}

	/**
	 * 查询单个实体，默认格式
	 * 
	 * @throws Exception
	 */
	@Test
	public void queryForEntityAndDefaultFormat() throws Exception {
		mockMvc.perform(
				get("/query/" + getEntityName() + "/" + getPrimaryKey(getTestEntity()) + "?view=" + getViewName()))
				.andExpect(status().isOk());
	}

	/**
	 * 查询单个实体，HTML格式
	 * 
	 * @throws Exception
	 */
	@Test
	public void queryForEntityAndHtmlFormat() throws Exception {
		mockMvc.perform(get("/query/" + getEntityName() + "/" + getPrimaryKey(getTestEntity()) + "?format=html&view="
				+ getViewName())).andExpect(status().isOk());
	}

	@Test
	public void queryForEntityAndJsonFormat() throws Exception {
		mockMvc.perform(
				get("/query/" + getEntityName() + "/" + getPrimaryKey(getTestEntity()) + "?view=" + getViewName()))
				.andExpect(status().isOk());
	}

	/**
	 * 查询实体列表
	 * 
	 * @throws Exception
	 */
	@Test
	public void queryForDataTable() throws Exception {
		mockMvc.perform(get("/query/list/" + getEntityName() + "/" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 查询数据用于Select选择控件
	 * 
	 * @throws Exception
	 */
	@Test
	public void queryForSelect() throws Exception {
		mockMvc.perform(get("/query/select/" + getEntityName() + "?length=100")).andExpect(status().isOk());
	}

	/**
	 * 查看实体元模型数据，json格式
	 */
	@Test
	public void viewMetaData() throws Exception {
		mockMvc.perform(get("/meta/" + getEntityName())).andExpect(status().isOk());
	}

	public ResultActions fullTextSearch(final String searchText) throws Exception {
		return mockMvc.perform(get("/search/" + getEntityName() + "/" + searchText));
	}

	public ResultActions fullTextSearch(final String searchText, int page, int size) throws Exception {
		return mockMvc
				.perform(get("/search/" + getEntityName() + "/" + searchText + "?page=" + page + "&size=" + size));
	}

	public ResultActions showSearchEntityView(String searchText) throws Exception {
		return mockMvc.perform(get("/vp/search/" + getEntityName() + "?q=" + searchText));
	}

	public ResultActions showSearchEntityView(String searchText, int page, int size) throws Exception {
		return mockMvc
				.perform(get("/vp/search/" + getEntityName() + "?q=" + searchText + "?page=" + page + "&size=" + size));
	}

	@Test
	public void restForFindAll() throws Exception {
		mockMvc.perform(get("/flydata/find/" + getEntityName() + "?view=" + getViewName())).andExpect(status().isOk())
				.andDo(print());
	}

	// /**
	// * 保存备注
	// *
	// * @throws Exception
	// */
	// @Test
	// public void saveCommonSubTableForNote() throws Exception {
	// if ("note".equals(getEntityName())){
	// return;
	// }
	// Note note = new Note();
	// note.setName("hello");
	// mockMvc.perform(post(
	// "/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/notes" +
	// convertToParameters((T) note)))
	// .andExpect(containsAlertTitle("保存成功")).andExpect(status().isOk());
	// }

	// /**
	// * 保存附件
	// *
	// * @throws Exception
	// */
	// @Test
	// public void saveCommonSubTableForAttachment() throws Exception {
	// if ("attachment".equals(getEntityName())){
	// return;
	// }
	// Attachment note = new Attachment();
	// note.setName("hello");
	// mockMvc.perform(post(
	// "/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/attachments" +
	// convertToParameters((T) note)))
	// .andExpect(containsAlertTitle("保存成功")).andExpect(status().isOk());
	// }
}
