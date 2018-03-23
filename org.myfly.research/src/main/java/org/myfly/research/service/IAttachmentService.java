package org.myfly.research.service;

import java.util.List;

import org.myfly.research.domain.Attachment;
import org.myfly.research.domain.Attachment2;

public interface IAttachmentService {

	Attachment save(Attachment entity);
	
	void delete(Attachment entity);
	
	Attachment update(Attachment entity);
	
	Attachment find(Attachment entity);
	
	Attachment find(String uid);
	
	List<Attachment2> search(String queryString);
	
	Attachment2 searchOne(String uid);
	
	Attachment findNoCache(String uid);
	
	void deleteAll();
	
	void deleteAllSearch();
	
	void index(Attachment entity);
	
	void index(Attachment2 entity);
}
