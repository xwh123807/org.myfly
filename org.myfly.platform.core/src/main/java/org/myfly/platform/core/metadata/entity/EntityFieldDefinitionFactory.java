package org.myfly.platform.core.metadata.entity;

import java.lang.reflect.Field;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class EntityFieldDefinitionFactory {
	@SuppressWarnings("unchecked")
	public static <T extends EntityFieldDefinition> T buildEntityFieldDefinition(Field field) {
		if (field.getAnnotation(OneToMany.class) != null) {
			return (T) new MDRelationFieldDefinition(field);
		} else if (field.getAnnotation(ManyToOne.class) != null) {
			return (T) new SearchRelationFieldDefinition(field);
		} else {
			return (T) new EntityFieldDefinition(field);
		}
	}
}
