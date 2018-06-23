package org.myfly.platform.core3.model.dict;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Color")
@FlyTable(name = "System Color", description = "Color for backgrounds or indicators")
public class PColor extends FlyEntity {

}
