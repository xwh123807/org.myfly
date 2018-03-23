package org.myfly.research.service;

import org.myfly.research.domain.Attachment2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AttachmentSearchRepository extends ElasticsearchRepository<Attachment2, String>{

}
