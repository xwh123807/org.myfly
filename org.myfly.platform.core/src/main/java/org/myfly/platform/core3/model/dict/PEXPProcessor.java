package org.myfly.platform.core3.model.dict;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_EXP_Processor")
@FlyTable(name = "Export Processor")
public class PEXPProcessor extends FlyEntity {

}
