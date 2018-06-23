package org.myfly.platform.core3.model.dict;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Image")
@FlyTable(name = "Image", description = "System Image or Icon")
public class PImage extends FlyEntity {

}
