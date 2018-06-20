package org.myfly.platform.core3.domain;

public enum AccessLevel implements IRefList{
	ALL, CLIENT, ORGANIZATION, SYSTEM, SYSTEMCLEINT, CLIENTORGANIZATION;

	@Override
	public String getName() {
		return null;
	}
	
}
