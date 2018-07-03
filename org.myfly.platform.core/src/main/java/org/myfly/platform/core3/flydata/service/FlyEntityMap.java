package org.myfly.platform.core3.flydata.service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.define.FlyDataModel;

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
public class FlyEntityMap extends HashMap<String, Object> implements IFlyEntity {

	/**
	 * @param from
	 */
	public FlyEntityMap(HashMap<String, Object> from) {
		putAll(from);
	}

	public FlyEntityMap() {
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
	 * 同clone
	 * 
	 * @return
	 */
	public FlyEntityMap copy() {
		return JSONUtil.fromJSON(toJson(), FlyEntityMap.class);
	}

	/**
	 * 打印json
	 */
	public void printJson() {
		System.out.println(toJson());
	}

	/**
	 * 将FlyEntity转换为实体类
	 * 
	 * @param entityName
	 * @return
	 */
	public Object toEntity(String entityName) {
		FlyDataModel metaData = AppUtil.getFlyDataModel(entityName);
		return FlyEntityUtils.toEntity(metaData, this);
	}

	/**
	 * 合并
	 * 
	 * @param entityb
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public FlyEntityMap merge(Map entityb) {
		entityb.keySet().forEach(name -> {
			if (entityb.get(name) instanceof Collection) {
				// 集合属性
				if (this.containsKey(name)) {
					((Collection) this.get(name)).addAll((Collection) entityb.get(name));
				} else {
					this.put((String) name, entityb.get(name));
				}
			} else {
				this.put((String) name, entityb.get(name));
			}
		});
		return this;
	}

	@Override
	public Timestamp getCreated() {
		return ClassUtil.convert(get(IFlyEntity.CREATED), Timestamp.class);
	}

	@Override
	public void setCreated(Timestamp created) {
		put(IFlyEntity.CREATED, created);
	}

	@Override
	public Timestamp getUpdated() {
		return ClassUtil.convert(get(IFlyEntity.UPDATED), Timestamp.class);
	}

	@Override
	public void setUpdated(Timestamp updated) {
		put(IFlyEntity.UPDATED, updated);
	}

	@Override
	public Boolean getIsActive() {
		return ClassUtil.convert(get(IFlyEntity.ACTIVE), Boolean.class);
	}

	@Override
	public void setIsActive(Boolean active) {
		put(IFlyEntity.ACTIVE, active);
	}

	@Override
	public String getCreatedBy() {
		return (String) get(IFlyEntity.CREATED_BY);
	}

	@Override
	public void setCreatedBy(String createdBy) {
		put(IFlyEntity.CREATED_BY, createdBy);
	}

	@Override
	public String getUpdatedBy() {
		return (String) get(IFlyEntity.UPDATED_BY);
	}

	@Override
	public void setUpdatedBy(String updatedBy) {
		put(IFlyEntity.UPDATED_BY, updatedBy);
	}

	@Override
	public String getClientID() {
		return (String) get(IFlyEntity.CLIENT);
	}

	@Override
	public void setClientID(String client) {
		put(IFlyEntity.CLIENT, client);
	}

	@Override
	public String getOrgID() {
		return (String) get(IFlyEntity.ORG);
	}

	@Override
	public void setOrgID(String org) {
		put(IFlyEntity.ORG, org);
	}
}
