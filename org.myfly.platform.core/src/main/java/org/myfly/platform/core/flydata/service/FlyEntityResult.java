package org.myfly.platform.core.flydata.service;

import java.util.HashMap;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.JSONUtil;

/**
 * 数据查询结果集<br>
 * 1、字段为实体属性，而非数据库字段；<br>
 * 2、对数据类型增强，增加返回字段，如枚举、关联；增强字段都为对象类型，附加其他属性；<br>
 * 3、支持对象级联，包含1对1、1对多；<br>
 * 4、子表是否级联取数，可以通过参数控制；<br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyEntityResult extends HashMap<String, Object> {

	/**
	 * @param from
	 */
	public FlyEntityResult(HashMap<String, Object> from) {
		putAll(from);
	}

	public FlyEntityResult() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2325038605071598391L;

	/**
	 * 序列化为json
	 * 
	 * @return
	 */
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	/**
	 * 将实体json反序列化为实体对象
	 * 
	 * @param metaData
	 * @param jsonEntity
	 * @return
	 */
	public static <T> T toEntity(EntityMetaData metaData, String jsonEntity) {
		T entity = metaData.newEntityInstance();
		FlyEntityResult result = JSONUtil.fromJSON(jsonEntity, FlyEntityResult.class);
		metaData.getFieldMap().values().forEach(field -> {
			if (result.containsKey(field.getName())) {
				Object value = result.get(field.getName());
				if (value != null) {
					field.getValueHandler().setFieldValue(entity, value);
				}
			}
		});
		return entity;
	}

	/**
	 * 将实体类转换为FlyEntityResult
	 * 
	 * @param metaData
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityResult fromEntity(EntityMetaData metaData, Object entityObj) {
		FlyEntityResult result = new FlyEntityResult();
		for (EntityFieldDefinition field : metaData.getFieldMap().values()) {
			result.put(field.getName(), field.getValueHandler().getFieldValue(entityObj));
		}
		return result;
	}

	/**
	 * 将实体类转换为FlyEntityResult
	 * 
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityResult fromEntity(Object entityObj) {
		return fromEntity(AppUtil.getEntityMetaData(entityObj.getClass().getName()), entityObj);
	}

	public void printJson() {
		System.out.println(toJson());
	}

}
