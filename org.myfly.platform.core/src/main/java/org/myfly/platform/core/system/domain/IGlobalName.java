package org.myfly.platform.core.system.domain;

/**
 * 通用ID名称表
 * @author xiangwanhong
 *
 */
public interface IGlobalName extends IFlyEntity {
	public String getInternalTable();

	public void setInternalTable(String internalTable);
}
