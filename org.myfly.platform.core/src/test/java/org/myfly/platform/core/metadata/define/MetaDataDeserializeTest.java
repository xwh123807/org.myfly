package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;

public class MetaDataDeserializeTest {
	@Test
	public void list() {
		ListDefinition define = new ListDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, ListDefinition.class);
		Assert.assertNotNull(define);
	}

	@Test
	public void form() {
		FormDefinition define = new FormDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, FormDefinition.class);
		Assert.assertNotNull(define);
	}

	@Test
	public void outline() {
		OutlineDefinition define = new OutlineDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, OutlineDefinition.class);
		Assert.assertNotNull(define);
	}

	@Test
	public void table() {
		TableDefinition define = new TableDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, TableDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void FieldDefinition() {
		FieldDefinition define = new FieldDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, FieldDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void FieldSetDefinition() {
		FieldSetDefinition define = new FieldSetDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, FieldSetDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void FilterDefinition() {
		FilterDefinition define = new FilterDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, FilterDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void OrderDefinition() {
		OrderDefinition define = new OrderDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, OrderDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void SectionDefinition() {
		SectionDefinition define = new SectionDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, SectionDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void SubTableDefinition() {
		SubTableDefinition define = new SubTableDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, SubTableDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void MetaDataDefinition() {
		MetaDataDefinition define = new MetaDataDefinition();
		String json = JSONUtil.toJSON(define);
		System.out.println(json);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, MetaDataDefinition.class);
		Assert.assertNotNull(define);
	}
}
