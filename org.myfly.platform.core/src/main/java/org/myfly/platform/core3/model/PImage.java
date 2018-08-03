package org.myfly.platform.core3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core3.datamodel.annotation.FlyTable;
import org.myfly.platform.core3.domain.FlyEntity;

@Entity
@Table(name = "PT_Image")
@FlyTable(name = "Image", description = "System Image or Icon")
@FlyRefTable(apiName = "imageID", name = "图像", keyColumn = "imageID", displayColumn = "name")
public class PImage extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2263361220472355322L;

	@Id
	@Column(length = 32)
	private String imageID;

	@Column
	private byte[] binaryData;

	@Column(length = 60)
	private String name;

	@Column(length = 120)
	private String imageURL;

	@Column(length = 255)
	private String description;

	public String getImageID() {
		return imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}

	public byte[] getBinaryData() {
		return binaryData;
	}

	public void setBinaryData(byte[] binaryData) {
		this.binaryData = binaryData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
