package org.myfly.platform.core.testmodel;

import org.apache.commons.lang3.ObjectUtils;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.model.test.PTMaster;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class TestModel {
	/**
	 * 用于测试新增的实体，预先构造好数据
	 */
	private PTMaster testEntity;
	/**
	 * 用于测试修改的实体，预先构造好数据
	 */
	private PTMaster changedEntity;

	/**
	 * 测试新增后实体，数据库查询返回期望的结果
	 */
	private FlyEntityMap flyTestEntity;

	/**
	 * 测试修改后实体,数据库查询返回期望的结果
	 */
	private FlyEntityMap flyChangedEntity;

	/**
	 * 主记录uid
	 */
	private String uid = UUIDUtil.newUUID();
	/**
	 * details子表记录id
	 */
	private String subUid = UUIDUtil.newUUID();

	public PTMaster getTestEntity() {
		return testEntity;
	}

	public void setTestEntity(PTMaster testEntity) {
		this.testEntity = testEntity;
	}

	public PTMaster getChangedEntity() {
		return changedEntity;
	}

	public void setChangedEntity(PTMaster changedEntity) {
		this.changedEntity = changedEntity;
	}

	public FlyEntityMap getFlyTestEntity() {
		return flyTestEntity;
	}

	public void setFlyTestEntity(FlyEntityMap flyTestEntity) {
		this.flyTestEntity = flyTestEntity;
	}

	public FlyEntityMap getFlyChangedEntity() {
		return flyChangedEntity;
	}

	public void setFlyChangedEntity(FlyEntityMap flyChangedEntity) {
		this.flyChangedEntity = flyChangedEntity;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getSubUid() {
		return subUid;
	}

	public void setSubUid(String subUid) {
		this.subUid = subUid;
	}

	public TestModel() {
		buildTestModelEntities();
	}

	/**
	 * 构建测试实体，以及查询返回的增强实体
	 */
	private void buildTestModelEntities() {
		setTestEntity(newTestEntity());
		setChangedEntity(newChangedEntity());
		setFlyTestEntity(newFlyEntity(getTestEntity()));
		setFlyChangedEntity(newFlyEntity(getChangedEntity()));
	}

	private FlyEntityMap newFlyEntity(PTMaster from) {
		FlyEntityMap entity = FlyEntityUtils.fromEntity(from).copy();
		return entity;
	}

	private PTMaster newTestEntity() {
		PTMaster entity = new PTMaster();
		entity.setMasterID(getUid());
		entity.setName(UUIDUtil.newHtmlID());
		return entity;
	}

	private PTMaster newChangedEntity() {
		PTMaster entity = new PTMaster();
		entity.setMasterID(getUid());
		entity.setName(UUIDUtil.newHtmlID());
		
		entity.setName(entity.getName() + " changed");
		entity.setUpdated(DateUtil.nowSqlTimestamp());
		return entity;
	}
}
