package org.myfly.platform.metadata.visualpage.render;

import java.text.MessageFormat;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.utils.AssertConstants;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;

public class MetadataUtil {
	private static Log log = LogFactory.getLog(MetadataUtil.class);

	/**
	 * 在Mtable中找出属性等于attrName的字段
	 * 
	 * @param mtable
	 * @param attrName
	 * @return
	 */
	public static MField getField(MTable mtable, String attrName) {
		AssertUtil.parameterEmpty(mtable, "mtable");
		AssertUtil.parameterEmpty(attrName, "attrName");
		MField result = null;
		for (MField field : mtable.getFields()) {
			if (field.getAttrName().equalsIgnoreCase(attrName)) {
				result = field;
				break;
			}
		}
		if (result == null) {
			if (log.isErrorEnabled()) {
				log.error(MessageFormat.format(AssertConstants.RECORD_NOT_FOUND, mtable.getEntityName() + ".attrName",
						attrName));
			}
			result = new MField();
			result.setName("错误");
			result.setAttrName(attrName);
		}
		return result;
	}

	/**
	 * 
	 * @param mtable
	 * @param tableAttr
	 * @param subTableAttr
	 * @return
	 */
	public static MField getField(MTable mtable, String tableAttr, String subTableAttr) {
		// 获取子表字段
		MField mfield = getField(mtable, tableAttr);
		// 获取子表对应的属性
		//return getField(mfield.getRelationTable(), subTableAttr);
		return null;
	}

	/**
	 * Field类型转换
	 * 
	 * @param fields
	 * @return
	 */
	public static FieldDefinition[] metaFieldsToField(List<MField> fields) {
		AssertUtil.parameterEmpty(fields, "metaFieldsToField.fields");
		FieldDefinition[] items = new FieldDefinition[fields.size()];
		for (int i = 0; i < fields.size(); i++) {
			MField field = fields.get(i);
			items[i] = metaFieldToField(field);
		}
		return items;
	}
	
	/**
	 * Field类型转换
	 * @param field
	 * @return
	 */
	public static FieldDefinition metaFieldToField(MField field){
		AssertUtil.parameterEmpty(field, "metaFieldToField.field");
		FieldDefinition item = new FieldDefinition(field.getName(), field.getAttrName(), field.getFieldDataType());
		if (field.getRelationTable() != null) {
			item.setRelationTable(field.getRelationTable());
		}
		item.setRelationClass(field.getRelationClassName());
		if (field.getMustRequired() != null){
			item.setRequired(field.getMustRequired().booleanValue());
		}
		if (field.getLength()!= null){
			item.setMaxLength(field.getLength().intValue());
		}
		if (field.getMinLength() != null){
			item.setMinLength(field.getMinLength().intValue());
		}
		return item;
	}
}
