package org.myfly.platform.core.domain;

public interface IFlyMetaEntity{
	public final String Name = "name";
	public final String Description = "description";
	public final String Help = "help";
	public final String EntityType = "entityType";

	public String getName();

	public void setName(String value);

	public String getDescription();

	public void setDescription(String value);

	public String getHelp();

	public void setHelp(String value);
}
