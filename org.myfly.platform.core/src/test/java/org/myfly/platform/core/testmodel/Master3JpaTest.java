package org.myfly.platform.core.testmodel;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class Master3JpaTest {
	@Autowired
	private IJpaDataAccessService service;

	@Test
	public void base() {
		Master3 entity = new Master3();
		entity.setId1(1);
		entity.setId2(1);
		entity.setName("name");
		Set<Detail3> details = new HashSet<>();
		Detail3 detail = new Detail3();
		detail.setIid(1);
		detail.setMaster(entity);
		details.add(detail);
		entity.setDetails(details);
		service.saveEntity(entity);
	}
}
