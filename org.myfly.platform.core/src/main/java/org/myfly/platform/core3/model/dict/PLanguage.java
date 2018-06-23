package org.myfly.platform.core3.model.dict;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Language")
@FlyTable(name = "Language ID")
public class PLanguage extends FlyEntity {

}
