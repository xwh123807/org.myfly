package org.myfly.platform.core.controller;

import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.internal.DataQueryRestService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CoreApplication.class)
public class DataQueryRestServiceTest extends ServiceTestCase {
	@Autowired
	private DataQueryRestService dataQueryRestService;
	
	@Test
	public void queryEntityForSUserAndJson(){
		
	}
}
