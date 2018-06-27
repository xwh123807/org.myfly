package org.myfly.platform.core3.metadata.annotation;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;

public @interface FlyElement {
	String name() default "";

	EntityType entityType() default EntityType.D;

	String description() default "";

	String help() default "";

	FlyDataType dataType() default FlyDataType.NONE;

	String columnName() default "";
	
	String printName() default "";
	
	int fieldLength() default 255;
}
