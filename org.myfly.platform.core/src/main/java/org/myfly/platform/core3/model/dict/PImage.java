package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Image")
@FlyTable(name = "Image", description = "System Image or Icon")
public class PImage extends FlyEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2263361220472355322L;

	@Id
	@Column(length=32)
	private String imageID;

	public String getImageID() {
		return imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}
}
