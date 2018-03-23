package org.myfly.platform.system.search;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.search.service.ISearchService;
import org.myfly.platform.core.user.domain.SGlobalName;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class SearchServiceTest extends ServiceTestCase{
	@Autowired
	private ISearchService searchService;
	//
	// public SearchServiceTest() {
	// searchService = new SearchService();
	// searchService.setSearchProperties(new SearchProperties());
	// }
	//
	// /**
	// * 对附件进行索引
	// */
	// @Test
	// public void indexAttachments() {
	// // String path = "/Users/xiangwanhong/Downloads/";
	// String path =
	// "/Users/xiangwanhong/git/microapps/org.myfly.platform.parent/org.myfly.platform.system/src/test/java";
	// searchService.indexAttachments(path);
	// }
	//
	// /**
	// * 在附件中搜索
	// */
	// @Test
	// public void searchAttachments() {
	// String queryString = "name";
	// Page<Map<String, String>> docs =
	// searchService.searchAttachments(queryString, 1, 5);
	// Assert.assertNotNull(docs);
	// System.out.println("TotalElements: " + docs.getTotalElements());
	// }

	@Test
	public void crud() {
		SGlobalName entity = new SGlobalName();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("jone");
		entity.setInternalTable("suser");
		IndexQuery indexQuery = new IndexQueryBuilder().withIndexName("sglobalname").withType(entity.getInternalTable())
				.withId(entity.getUid()).withSource(JSONUtil.toJSON(entity)).build();
		searchService.index(indexQuery);
		
		SGlobalName entity1 = searchService.search(entity.getUid(), SGlobalName.class);
		Assert.assertNotNull(entity1);
	}
}
