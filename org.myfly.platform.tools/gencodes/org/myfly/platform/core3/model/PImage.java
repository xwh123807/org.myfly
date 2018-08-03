package org.myfly.platform.core3.model;

import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(
    name = "PT_Image"
)
@FlyTable(
    name = "Image",
    description = "System Image or Icon",
    help = ""
)
public class PImage {
  @Column(
      length = 32
  )
  private String imageID;

  @Column(
      length = 32
  )
  private String entityType;

  @Column
  private byte[] binaryData;

  @Column(
      length = 60
  )
  private String name;

  @Column(
      length = 120
  )
  private String imageURL;

  @Column(
      length = 255
  )
  private String description;
}
