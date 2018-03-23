package org.myfly.research.internal;

import java.util.UUID;

import org.elasticsearch.action.index.IndexResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.research.domain.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticSearchTemplateTest {
	@Autowired
	private ElasticsearchTemplate searchTemplate;

	@Test
	public void newIndex() throws JsonProcessingException {
		searchTemplate.createIndex(Attachment.class);
		Attachment entity = new Attachment();
		entity.setUid(UUID.randomUUID().toString());
		entity.setName("name " + System.currentTimeMillis());
		ObjectMapper mapper = new ObjectMapper();
		IndexResponse response = searchTemplate.getClient().prepareIndex("attachment", "attachment", entity.getUid())
				.setSource(mapper.writeValueAsBytes(entity)).get();
		Assert.assertNotNull(response);
		System.out.println(response);
	}

}
