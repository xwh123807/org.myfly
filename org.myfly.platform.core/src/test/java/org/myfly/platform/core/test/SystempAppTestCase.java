package org.myfly.platform.core.test;

import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=SystemApplication.class)

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment=WebEnvironment.RANDOM_PORT)
public abstract class SystempAppTestCase{
}
