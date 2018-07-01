package org.myfly.platform.core3.flydata.dbinit;

import org.junit.Test;
import org.myfly.platform.core3.dbinit.EntityTypeImporter;
import org.myfly.platform.core3.domain.EntityType;

public class EntityTypeImporterTest {
	@Test
	public void convert() {
		EntityTypeImporter importer = new EntityTypeImporter();
		importer.load(EntityType.class);
		importer.beforeSave();
		importer.printJson();
	}
}
