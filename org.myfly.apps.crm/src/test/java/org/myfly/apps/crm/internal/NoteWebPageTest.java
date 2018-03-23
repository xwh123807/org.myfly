package org.myfly.apps.crm.internal;

import org.myfly.platform.system.core.domain.Note;
import org.myfly.platform.system.test.EntityActionsWebPageTestCase;
import org.myfly.platform.system.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class NoteWebPageTest extends EntityActionsWebPageTestCase<Note, String>{
	@Autowired
	private CrmInitData crmInitData;

	@Override
	public Class<Note> getEntityClass() {
		return Note.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public String getEntityPk() {
		return crmInitData.getNote().getUid();
	}

	@Override
	public Note getNewEntity() {
		return crmInitData.newNote(UUIDUtil.newUUID());
	}

	@Override
	public Note getSaveAndNewEntity() {
		return crmInitData.newNote(UUIDUtil.newUUID());
	}

	@Override
	public Note getUpdateEntity() {
		Note note = new Note();
		note.setTitle("title changed");
		return note;
	}

}
