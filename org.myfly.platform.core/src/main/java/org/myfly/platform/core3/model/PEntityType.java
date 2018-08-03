package org.myfly.platform.core3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core3.datamodel.annotation.FlyReferences;
import org.myfly.platform.core3.datamodel.annotation.FlyTable;
import org.myfly.platform.core3.domain.FlyMetaEntity;

/**
 * 实体类型 <br>
 * 1、用于区分元数据由那些应用创建 <br>
 * 2、数据从枚举EntityType中导入 <br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_EntityType")
@FlyTable(name = "Entity Type", description = "Dictionary Entity Type; Determines ownership and synchronization", //
		help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  n\"\n"
				+ "			+ \"n\" + \"For customizations, copy the entity and select \"User\"!")
@FlyReferences(references = {
		@FlyRefTable(apiName = "entityTypeID", keyColumn = "entityTypeID", displayColumn = "name", name = "实体类型"),
		@FlyRefTable(apiName = "entityType", keyColumn = "entityType", displayColumn = "name", name = "实体类型") })
public class PEntityType extends FlyMetaEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6483602442513738011L;

	@Id
	@Column(length = 32)
	private String entityTypeID;

	@Column(length = 40, unique = true)
	private String entityType;

	@Column(length = 255)
	private String modelPackage;

	@Column(length = 255)
	private String classpath;

	@Column
	private Boolean processing;

	public String getEntityTypeID() {
		return entityTypeID;
	}

	public void setEntityTypeID(String entityTypeID) {
		this.entityTypeID = entityTypeID;
	}

	public String getModelPackage() {
		return modelPackage;
	}

	public void setModelPackage(String modelPackage) {
		this.modelPackage = modelPackage;
	}

	public Boolean getProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getClasspath() {
		return classpath;
	}

	public void setClasspath(String classpath) {
		this.classpath = classpath;
	}

}
