package org.myfly.apps.crm.internal;

import javax.transaction.Transactional;

import org.myfly.platform.system.context.SystemContext;
import org.myfly.platform.system.core.domain.Note;
import org.myfly.platform.system.data.service.IFlyDataAccessService;
import org.myfly.platform.system.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CrmInitData {
	@Autowired
	@Qualifier("jdbcFlyDataAccessService")
	private IFlyDataAccessService queryUseMetaDataService;

	private Note note;

	@Transactional
	public Note getNote() {
		if (note == null) {
			String uid = UUIDUtil.newUUID();
			note = newNote(uid);
			queryUseMetaDataService.saveEntity(note);
		}
		return note;
	}

	public Note newNote(String uid) {
		Note note = new Note();
		note.setUid(uid);
		note.setTitle("hello " + uid);
		note.setBody("hello body");
		note.setOwnerId(SystemContext.SYS_SUSER_UID);
		note.setParentId(SystemContext.SYS_SUSER_UID);
		return note;
	}
}
