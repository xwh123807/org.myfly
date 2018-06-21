package org.myfly.platform.core3.flydata.service;

import java.util.List;

public interface IFlyDataService {
	public FlyEntityResult3 findOne(String entityName, String uid);
	
	public void delOne(String entityName, String uid);

	public String saveEntity(String entityName, FlyEntityResult3 flyEntity);
	
	/**
	 * 新增实体，并返回实体，包含实体所有子表数据
	 * 
	 * @param entityName
	 * @param flyEntity
	 * @return
	 */
	FlyEntityResult3 saveEntityAndReturn(String entityName, FlyEntityResult3 flyEntity);

	public void updateEntity(String entityName, String uid, FlyEntityResult3 flyEntity);

	public void mergeEntity(String entityName, String uid, FlyEntityResult3 flyEntity);

	public List<FlyEntityResult3> findAll(String entityName);

	public FlyEntityResult3 find(String entityName, String uid, boolean hasSubTable, String[] subTableAttrs);
}
