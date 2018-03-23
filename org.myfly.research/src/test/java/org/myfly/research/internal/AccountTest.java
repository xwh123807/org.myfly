package org.myfly.research.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {
	@Autowired
	private ElasticsearchTemplate search;

	@Test
	public void search() throws IOException {
		Assert.assertNotNull(search);
		RestTemplate rest = new RestTemplate();
		InputStream bi = getClass().getResourceAsStream("/org/myfly/research/internal/accounts.json");
		Assert.assertNotNull(bi);
		String buffer = StreamUtils.copyToString(bi, Charset.forName("UTF-8"));
		rest.postForLocation("http://192.168.99.100:9200/bank/account/_bulk?pretty", buffer);

		// MatchAll
		SearchResponse response = search.getClient().prepareSearch("bank").setTypes("account").execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertEquals(1000, response.getHits().getTotalHits());

		// Match Field
		response = search.getClient().prepareSearch("bank").setQuery(QueryBuilders.matchQuery("account_number", 20))
				.execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertEquals(1, response.getHits().getTotalHits());

		response = search.getClient().prepareSearch("bank").setQuery(QueryBuilders.matchQuery("address", "mill"))
				.execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertEquals(4, response.getHits().getTotalHits());

		response = search.getClient().prepareSearch("bank").setQuery(QueryBuilders.matchQuery("address", "mill lane"))
				.execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertEquals(19, response.getHits().getTotalHits());

		// matchPhraseQuery
		response = search.getClient().prepareSearch("bank")
				.setQuery(QueryBuilders.matchPhraseQuery("address", "mill lane")).execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertEquals(1, response.getHits().getTotalHits());

		response = search.getClient().prepareSearch("bank").setQuery(QueryBuilders.boolQuery()
				.must(QueryBuilders.matchQuery("address", "mill")).must(QueryBuilders.matchQuery("address", "lane")))
				.execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertEquals(1, response.getHits().getTotalHits());

		response = search.getClient().prepareSearch("bank")
				.setQuery(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("address", "mill"))
						.should(QueryBuilders.matchQuery("address", "lane")))
				.execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertEquals(19, response.getHits().getTotalHits());

		response = search.getClient().prepareSearch("bank")
				.addAggregation(AggregationBuilders.terms("by_state").field("state")).execute().actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertNotNull(response.getAggregations().get("by_state"));

		response = search.getClient().prepareSearch("bank").addAggregation(AggregationBuilders.terms("by_state")
				.field("state").subAggregation(AggregationBuilders.terms("by_city").field("city"))).execute()
				.actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertNotNull(response.getAggregations().get("by_state"));
		
		response = search.getClient().prepareSearch("bank").addAggregation(AggregationBuilders.terms("by_state")
				.field("state")).addAggregation(AggregationBuilders.terms("by_city").field("city")).execute()
				.actionGet();
		Assert.assertNotNull(response);
		System.out.println(response);
		Assert.assertNotNull(response.getAggregations().get("by_state"));
		Assert.assertNotNull(response.getAggregations().get("by_city"));
	}
}
