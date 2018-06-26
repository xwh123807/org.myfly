package org.myfly.platform.core3.model.test;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;

@Entity
@Table(name="PT_Detail")
public class PTDetail extends FlyEntity {
	@ManyToOne(fetch = FetchType.LAZY)
	private PTMaster master;

	public PTMaster getMaster() {
		return master;
	}

	public void setMaster(PTMaster master) {
		this.master = master;
	}
}
