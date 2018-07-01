package org.myfly.platform.core3.flydata.dbinit;

import org.junit.Test;
import org.myfly.platform.core3.dbinit.ElementImporter;
import org.myfly.platform.core3.domain.Element;

public class ElementImporterTest {
	@Test
	public void convert() {
		ElementImporter importer = new ElementImporter();
		importer.load(Element.class);
		importer.beforeSave();
		importer.printJson();
	}
}
