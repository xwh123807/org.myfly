package org.myfly.platform.core3.metadata.define;

public interface IDefinition {
	String getKey();
	void validate();
	String toJson();
	void printJson();
}
