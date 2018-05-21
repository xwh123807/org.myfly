package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;

public class MetaDataDeserializeTest {
	@Test
	public void list() {
		ListDefinition define = new ListDefinition();
		String json = JSONUtil.toJSON(define);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, ListDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void form() {
		FormDefinition define = new FormDefinition();
		String json = JSONUtil.toJSON(define);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, FormDefinition.class);
		Assert.assertNotNull(define);
	}
	
	@Test
	public void outline() {
		OutlineDefinition define = new OutlineDefinition();
		String json = JSONUtil.toJSON(define);
		Assert.assertNotNull(json);
		define = JSONUtil.fromJSON(json, OutlineDefinition.class);
		Assert.assertNotNull(define);
	}
}
