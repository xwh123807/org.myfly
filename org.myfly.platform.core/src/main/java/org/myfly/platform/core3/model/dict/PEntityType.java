package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

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
@FlyRefTable(keyColumn = "entityType", displayColumn = "name", name = "Entity Type")
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
	private String classPath;

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

	public String getClassPath() {
		return classPath;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
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

}
