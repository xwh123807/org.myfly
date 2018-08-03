package org.myfly.platform.core.domain;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class FlyMetaEntity extends FlyEntity implements IFlyMetaEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8761910847844144967L;

	@Column(length = 60)
	private String name;

	@Column(length = 255)
	private String description;

	@Column(length = 2000)
	private String help;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String value) {
		this.name = value;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String value) {
		this.description = value;
	}

	@Override
	public String getHelp() {
		return help;
	}

	@Override
	public void setHelp(String value) {
		this.help = value;
	}
}
