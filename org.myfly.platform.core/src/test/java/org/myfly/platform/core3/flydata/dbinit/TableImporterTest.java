package org.myfly.platform.core3.flydata.dbinit;

import org.junit.Test;
import org.myfly.platform.core3.dbinit.TableImporter;
import org.myfly.platform.core3.model.data.PTable;

public class TableImporterTest {
	@Test
	public void importer() {
		TableImporter importer = new TableImporter();
		importer.load(PTable.class);
		importer.printJson();
	}
}
