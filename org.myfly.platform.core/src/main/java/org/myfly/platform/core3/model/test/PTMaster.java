package org.myfly.platform.core3.model.test;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Master")
@FlyTable(name = "Master", description = "测试主表，用于测试所有数据类型和特性")
public class PTMaster extends FlyEntity {

}
