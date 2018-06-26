package org.myfly.platform.core3.model.test;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Master")
@FlyTable(name = "Master", description = "测试主表，用于测试所有数据类型和特性")
public class PTMaster extends FlyEntity {
	@Column
	private String name;
	
	@OneToMany(mappedBy = "master", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<PTDetail> details;

	public Set<PTDetail> getDetails() {
		return details;
	}

	public void setDetails(Set<PTDetail> details) {
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
