package org.myfly.platform.core.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.define.DivDefinition;
import org.myfly.platform.core.metadata.define.SectionDefinition;
import org.myfly.platform.core.metadata.define.SectionType;
import org.myfly.platform.core.visualpage.service.ViewType;
import org.myfly.platform.core.visualpage.ui.control.DivsRender;
import org.myfly.platform.core.visualpage.ui.view.SectionViewRender;

public class DivsRenderTest {
	@Test
	public void htmlForDefault() {
		DivDefinition[] divs = new DivDefinition[2];
		divs[0] = new DivDefinition(null);
		divs[1] = new DivDefinition(null);
		divs[1].setName("div1");
		divs[1].setExtClass("extclass1");

		DivsRender render = new DivsRender(divs, null);
		String html = render.html();
		// System.out.println(html);
//		Assert.assertEquals(
//				"<div class=''><div class='' divType='DEFAULT'></div><div class='extclass1' divType='DEFAULT' name='div1'></div></div>",
//				html);
	}

	@Test
	public void htmlForFiles() {
		DivDefinition[] divs = new DivDefinition[1];
		divs[0] = new DivDefinition(null);
		divs[0].setName("div1");

		SectionViewRender[] sectionRenders = new SectionViewRender[1];
		SectionDefinition sectionDefinition = new SectionDefinition(null, "files");
		sectionDefinition.setName("div1");
		sectionDefinition.setType(SectionType.ATTACHMENT);
		sectionRenders[0] = new SectionViewRender(sectionDefinition, ViewType.VIEW);

		DivsRender render = new DivsRender(divs, sectionRenders);
		String html = render.html();
		System.out.println(html);
//		Assert.assertEquals(
//				"<div class=''><div class='' divType='DEFAULT' name='div1'><div name='div1' class='FILES'>#parse(\"${pageInfo.layout}/components/files.vm\")</div></div></div>",
//				html);
	}

	@Test
	public void htmlForFilesAndNotes() {
		DivDefinition[] divs = new DivDefinition[1];
		divs[0] = new DivDefinition(null);
		// divs[0].setName("div1");

		DivDefinition[] divs2 = new DivDefinition[2];
		divs[0].setSubs(divs2);
		divs2[0] = new DivDefinition(divs[0]);
		divs2[0].setName("div11");
		divs2[1] = new DivDefinition(divs[0]);
		divs2[1].setName("div12");

		SectionViewRender[] sectionRenders = new SectionViewRender[2];
		SectionDefinition sectionDefinition = new SectionDefinition(null, "files");
		sectionDefinition.setName("div11");
		sectionDefinition.setType(SectionType.ATTACHMENT);
		sectionRenders[0] = new SectionViewRender(sectionDefinition, ViewType.VIEW);

		SectionDefinition sectionDefinition2 = new SectionDefinition(null, "notes");
		sectionDefinition2.setName("div12");
		sectionDefinition2.setType(SectionType.NOTE);
		sectionRenders[1] = new SectionViewRender(sectionDefinition2, ViewType.VIEW);

		DivsRender render = new DivsRender(divs, sectionRenders);
		String html = render.html();
		System.out.println(html);
//		Assert.assertEquals(
//				"<div class=''><div class='' divType='DEFAULT'><div class='' divType='DEFAULT' name='div11'><div name='div11' class='FILES'>#parse(\"${pageInfo.layout}/components/files.vm\")</div></div><div class='' divType='DEFAULT' name='div12'><div name='div12' class='NOTE'>#parse(\"${pageInfo.layout}/components/note.vm\")</div></div></div></div>",
//				html);
	}
}
