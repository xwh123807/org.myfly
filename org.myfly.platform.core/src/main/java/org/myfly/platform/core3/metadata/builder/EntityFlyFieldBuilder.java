package org.myfly.platform.core3.metadata.builder;

import javax.persistence.Column;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;

/**
 * 实体类字段构造器，从实体属性构建
 * 
 * @author xiangwanhong
 *
 */
public class EntityFlyFieldBuilder extends FlyFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2792351110786169083L;

	/**
	 * 从实体属性构造字段定义信息
	 * 
	 * @param field
	 */
	public EntityFlyFieldBuilder(FieldInfo field) {
		setApiName(field.getField().getName());
		FlyField view = field.getField().getAnnotation(FlyField.class);
		if (view != null) {
			setName(view.name());
			setEntityType(view.entityType());
			setDescription(view.description());
			setHelp(view.help());
			setColumnSQL(view.columnSQL());
			setDataType(view.dataType());
			setDefaultValue(view.defaultValue());
			setAllowCopy(view.isAllowCopy());
			setAllowLogging(view.isAllowLogging());
			setAlwaysUpdateable(view.isAlwaysUpdateable());
			setAutocomplete(view.isAutocomplete());
			setEncrypted(view.isEncrypted());
			setParent(view.isParent());
			setRange(view.isRange());
			setSelectionColumn(view.isSelectionColumn());
			setSyncDatabase(view.isSyncDatabase());
			setTranslated(view.isTranslated());
			setValueMin(view.valueMin());
			setValueMax(view.valueMax());
			setvFormat(view.vFormat());
		}
		Column column = field.getField().getAnnotation(Column.class);
		if (column != null) {
			setColumnName(column.name());
			setFieldLength(column.length());
		}
		if (StringUtils.isBlank(getName())) {
			setName(getApiName());
		}
		if (StringUtils.isBlank(getColumnName())) {
			setColumnName(StringUtil.getHibernateName(getApiName()));
		}
	}
}
