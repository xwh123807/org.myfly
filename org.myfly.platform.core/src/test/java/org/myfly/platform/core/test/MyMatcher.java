package org.myfly.platform.core.test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

import org.hamcrest.Matchers;
import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.domain.AlertInfo;
import org.myfly.platform.core.domain.AlertLevel;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class MyMatcher {
    
	public static ResultMatcher alertLevel(final AlertLevel alertLevel) {
		return new ResultMatcher() {
			@Override
			public void match(MvcResult result) throws Exception {
				AlertInfo alertInfo = UserContext.getUserSession().getAlertInfo();
				assertEquals("Model attribute alert.alertLevel", alertLevel, alertInfo.getLevel());
			}
		};
	}
	
	public static ResultMatcher alertTitleFromContent(final String title){
		return new ResultMatcher() {
			
			@Override
			public void match(MvcResult result) throws Exception {
				MockMvcResultMatchers.content().string(Matchers.containsString("<strong>" + title + "</strong>"));
			}
		};
	}
}
