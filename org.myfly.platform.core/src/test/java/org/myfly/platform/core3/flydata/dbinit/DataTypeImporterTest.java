package org.myfly.platform.core3.flydata.dbinit;

import org.junit.Test;
import org.myfly.platform.core3.dbinit.DataTypeImporter;
import org.myfly.platform.core3.domain.FlyDataType;

public class DataTypeImporterTest {
	@Test
	public void convert() {
		DataTypeImporter importer = new DataTypeImporter();
		importer.load(FlyDataType.class);
		importer.beforeSave();
		importer.printJson();
	}
}
