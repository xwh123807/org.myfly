package org.myfly.platform.core.metadata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mapping.PersistentProperty;

public class JpaEntityInfo {
	private String name;
	private Class<?> type;
	private List<PersistentProperty<?>> properties;

	public JpaEntityInfo() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	public List<PersistentProperty<?>> getProperties() {
		return properties;
	}

	public void addProperty(PersistentProperty<?> property) {
		if (this.properties == null) {
			this.properties = new ArrayList<>();
		}
		this.properties.add(property);
	}
}
