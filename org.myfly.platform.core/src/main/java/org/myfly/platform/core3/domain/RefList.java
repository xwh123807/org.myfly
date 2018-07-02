package org.myfly.platform.core3.domain;

import org.myfly.platform.core3.metadata.annotation.FlyRefItem;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;

public enum RefList {
	@FlyRefList(description = "", help = "", name = "AD_User ConnectionProfile", items = {
			@FlyRefItem(name = "VPN", value = "V"), @FlyRefItem(name = "WAN", value = "W") })
	List1
}
