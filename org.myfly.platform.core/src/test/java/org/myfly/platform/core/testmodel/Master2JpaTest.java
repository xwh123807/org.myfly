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
public class Master2JpaTest {
	@Autowired
	private IJpaDataAccessService service;

	@Test
	public void base() {
		Master2 entity = new Master2();
		entity.setId1(1);
		entity.setId2(1);
		entity.setName("name");
		Set<Detail2> details = new HashSet<>();
		Detail2 detail = new Detail2();
		detail.setDetailId(1);
		detail.setMaster(entity);
		details.add(detail);
		entity.setDetails(details);
		service.saveEntity(entity);
	}
}
