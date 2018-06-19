package org.myfly.platform.core3.metadata.builder;

import org.myfly.platform.core3.metadata.define.FlyTableDefinition;

/**
 * 从实体类中构建表定义信息，从实体类属性构建字段信息 <br>
 * 
 * @author xiangwanhong
 *
 */
public class EntityFlyTableBuilder extends FlyTableDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4409980077107637639L;

	/**
	 * 从实体类构建表、字段定义信息
	 * 
	 * @param entityClass
	 */
	public EntityFlyTableBuilder(Class<?> entityClass) {
		buildTableDefinition(entityClass);
		buildFieldDefintions(entityClass);
	}

	/**
	 * 从实体类构建表定义信息，读取注解@Entity、@Table、@FlyTable
	 * @param entityClass
	 */
	private void buildFieldDefintions(Class<?> entityClass) {

	}

	/**
	 * 从实体类属性中构建字段定义信息，读取注解@Column、@Id、@IdClass、@FlyField
	 * @param entityClass
	 */
	private void buildTableDefinition(Class<?> entityClass) {

	}
}
