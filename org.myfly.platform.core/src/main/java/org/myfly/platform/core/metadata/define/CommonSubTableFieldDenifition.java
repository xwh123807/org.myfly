package org.myfly.platform.core.metadata.define;

import org.apache.commons.lang.ClassUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.CommonSubTableType;
import org.myfly.platform.core.metadata.entity.RelationFieldDefinition;

/**
 * 通用子表字段定义
 * 
 * @author xiangwanhong
 *
 */
public class CommonSubTableFieldDenifition extends RelationFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7537493796092126909L;

	public CommonSubTableFieldDenifition(CommonSubTableType commonSubTableType, String relationTable,
			String relationClass) {
		super(null);
		setDataType(FieldDataType.FLYMDRELATION);
		setName(commonSubTableType.getAttrName());
		setTitle(commonSubTableType.getTitle());
		setRelationClass(commonSubTableType.getTableClass());
		setRelationTable(ClassUtils.getShortClassName(commonSubTableType.getTableClass()));
		setType(String.class);
	}

}
