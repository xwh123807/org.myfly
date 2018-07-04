package org.myfly.platform.core3.flydata.dbinit;

import org.junit.Test;
import org.myfly.platform.core3.dbinit.RefListImporter;
import org.myfly.platform.core3.dbinit.resources.RefLists;

public class RefListImporterTest {
	@Test
	public void convert() {
		RefListImporter importer = new RefListImporter();
		importer.load(RefLists.class);
		importer.beforeSave();
		importer.printJson();
	}
}
