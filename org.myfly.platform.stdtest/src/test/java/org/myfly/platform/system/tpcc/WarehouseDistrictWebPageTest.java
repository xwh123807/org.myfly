package org.myfly.platform.system.tpcc;

import org.myfly.platform.core.test.SubEntityActionsWebPageTestCase;
import org.myfly.platform.system.tpcc.domain.District;
import org.myfly.platform.system.tpcc.domain.DistrictPK;
import org.myfly.platform.system.tpcc.domain.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;

public class WarehouseDistrictWebPageTest
		extends SubEntityActionsWebPageTestCase<Warehouse, District, Long, DistrictPK> {
	@Autowired
	private TpccInitData tpcc;

	@Override
	public Class<Warehouse> getEntityClass() {
		return Warehouse.class;
	}

	@Override
	public Class<District> getSubEntityClass() {
		return District.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public Long getEntityPk() {
		return tpcc.getWarehouse().getWid();
	}

	@Override
	public DistrictPK getSubEntityPk() {
		return tpcc.getDistrictPK();
	}

	@Override
	public String getSubTableAttr() {
		return "districts";
	}

	@Override
	public District getNewSubEntity() {
		District district = tpcc.newDistrict(10);
		district.setName("name a");
		return district;
	}

	@Override
	public District getSaveAndNewSubEntity() {
		District district = tpcc.newDistrict(20);
		district.setName("name b");
		return district;
	}

	@Override
	public District getUpdateSubEntity() {
		District district = new District();
		district.setName("name gb");
		return district;
	}

}
