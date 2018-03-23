package org.myfly.platform.system.tpcc.service;

public interface ITpccDataService {

	/**
	 * 获取规模
	 * @return
	 */
	long getScale();

	/**
	 * 生成维度数据
	 */
	void generateDimensionDatas(long start);

	/**
	 * 生成订单数据
	 */
	void generateOrderDatas(long start);

	void setScale(long scale);

}