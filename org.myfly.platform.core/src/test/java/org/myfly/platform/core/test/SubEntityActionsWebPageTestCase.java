package org.myfly.platform.core.test;

import java.io.Serializable;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.internal.EntityUtil;
import org.myfly.platform.core.flydata.service.IJpaAccessService;
import org.myfly.platform.core.metadata.internal.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.test.MockMVCTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

/**
 * 实体子表Web页测试基类，测试实体
 * 
 * @author xiangwanhong
 *
 */
@SpringApplicationConfiguration(classes = CoreApplication.class)
public abstract class SubEntityActionsWebPageTestCase<M, T, MP extends Serializable, TP extends Serializable>
		extends MockMVCTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;
	@Autowired
	private IJpaAccessService dataAccessService;

	public abstract Class<M> getEntityClass();

	/**
	 * 获取实体子表类
	 * 
	 * @return
	 */
	public abstract Class<T> getSubEntityClass();

	/**
	 * 获取视图名称
	 * 
	 * @return
	 */
	public abstract String getViewName();

	/**
	 * 获取实体主键
	 * 
	 * @return
	 */
	public abstract MP getEntityPk();

	public abstract TP getSubEntityPk();

	public abstract String getSubTableAttr();

	/**
	 * 获取新增实体属性值
	 * 
	 * @return
	 */
	public abstract T getNewSubEntity();

	/**
	 * 获取新增并保存实体属性值
	 * 
	 * @return
	 */
	public abstract T getSaveAndNewSubEntity();

	/**
	 * 获取更新实体
	 * 
	 * @return
	 */
	public abstract T getUpdateSubEntity();

	public String getEntityName() {
		return ClassUtils.getShortClassName(getEntityClass()).toLowerCase();
	}

	public String getSubEntityName() {
		return ClassUtils.getShortClassName(getSubEntityClass()).toLowerCase();
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

	public String convertEntityPkToString() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(getEntityName());
		return metaData.getPKFieldDefinition().convertPKToString(getEntityPk());
	}

	public String convertSubEntityPkToString() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(getSubEntityName());
		return metaData.getPKFieldDefinition().convertPKToString(getSubEntityPk());
	}

	/**
	 * 导出到Excel
	 * 
	 * @throws Exception
	 */
	@Test
	public void exportToExcel() throws Exception {
		mockMvc.perform(get("/vp/excel/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr()
				+ "?view=" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 显示打印视图
	 * 
	 * @throws Exception
	 */
	@Test
	public void showListPrintView() throws Exception {
		mockMvc.perform(get("/vp/listprint/" + getEntityName() + "/" + convertEntityPkToString() + "/"
				+ getSubTableAttr() + "?view=" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 显示查看单个实体视图
	 * 
	 * @throws Exception
	 */
	@Test
	public void showViewEntityView() throws Exception {
		mockMvc.perform(get("/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr() + "/"
				+ convertSubEntityPkToString() + "?view=" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 显示新增实体视图
	 * 
	 * @throws Exception
	 */
	@Test
	public void showNewEntityView() throws Exception {
		mockMvc.perform(get("/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr()
				+ "?view=" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 保存新增实体
	 * 
	 * @throws Exception
	 */
	@Test
	public void saveNewEntity() throws Exception {
		mockMvc.perform(post("/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr()
				+ convertToParameters(getNewSubEntity()))).andExpect(containsAlertTitle("保存成功"))
				.andExpect(status().isOk());
	}

	/**
	 * 保存并新增实体
	 * 
	 * @throws Exception
	 */
	@Test
	public void saveAndNewEntity() throws Exception {
		mockMvc.perform(patch("/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr()
				+ convertToParameters(getSaveAndNewSubEntity()))).andExpect(containsAlertTitle("保存成功"))
				.andExpect(status().isOk());
	}

	/**
	 * 修改实体
	 * 
	 * @throws Exception
	 */
	@Test
	public void updateEntity() throws Exception {
		mockMvc.perform(put("/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr() + "/"
				+ convertSubEntityPkToString() + convertToParameters(getUpdateSubEntity()))).andExpect(status().isOk());
	}

	/**
	 * 查询子表数据
	 * 
	 * @throws Exception
	 */
	@Test
	public void dataQuery() throws Exception {
		mockMvc.perform(get("/query/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr()
				+ "/" + getViewName())).andExpect(status().isOk());
	}

	/**
	 * 查询数据用于Select选择控件
	 * 
	 * @throws Exception
	 */
	@Test
	public void queryEntityForSelect() throws Exception {
		mockMvc.perform(get("/query/select/" + getEntityName() + "?length=100")).andExpect(status().isOk());
	}

	@Test
	public void querySubEntityForSelect() throws Exception {
		mockMvc.perform(get("/query/select/" + getSubEntityName() + "?length=100")).andExpect(status().isOk());
	}

	@Test
	public void deleteEntity() throws Exception {

	}

	/**
	 * 查看实体元模型数据，json格式
	 */
	@Test
	public void viewMetaData() throws Exception {
		mockMvc.perform(get("/admin/meta/" + getEntityName())).andExpect(status().isOk());
	}

	/**
	 * 查看实体元模型数据，json格式
	 */
	@Test
	public void viewSubEntityMetaData() throws Exception {
		mockMvc.perform(get("/admin/meta/" + getSubEntityName())).andExpect(status().isOk());
	}

	public IJpaAccessService getDataAccessService() {
		return dataAccessService;
	}

	public void setDataAccessService(IJpaAccessService dataAccessService) {
		this.dataAccessService = dataAccessService;
	}

	@Test
	public void restForFindAllForSubEntity() throws Exception {
		mockMvc.perform(get("/flydata/" + getEntityName() + "/" + convertEntityPkToString() + "/" + getSubTableAttr()
				+ "?formViewName=" + getViewName())).andExpect(status().isOk()).andDo(print());
	}

//	/**
//	 * 保存备注
//	 * 
//	 * @throws Exception
//	 */
//	@Test
//	public void saveCommonSubTableForNote() throws Exception {
//		Note note = new Note();
//		note.setName("hello");
//		mockMvc.perform(post(
//				"/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/notes" + convertToParameters((T) note)))
//				.andExpect(containsAlertTitle("保存成功")).andExpect(status().isOk());
//	}
	
//	/**
//	 * 保存附件
//	 * 
//	 * @throws Exception
//	 */
//	@Test
//	public void saveCommonSubTableForAttachment() throws Exception {
//		Attachment note = new Attachment();
//		note.setName("hello");
//		mockMvc.perform(post(
//				"/vp/" + getEntityName() + "/" + convertEntityPkToString() + "/attachments" + convertToParameters((T) note)))
//				.andExpect(containsAlertTitle("保存成功")).andExpect(status().isOk());
//	}
}
