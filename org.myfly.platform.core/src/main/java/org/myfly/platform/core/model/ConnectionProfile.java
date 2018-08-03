package org.myfly.platform.core.model;

import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@FlyTable(name = "Connection Profile", description = "How a Java Client connects to the server(s)", help = "Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile.")
public enum ConnectionProfile {
	@FlyField(name = "LAN")
	L,
	//
	@FlyField(name = "Terminal Server")
	T,
	//
	@FlyField(name = "VPN")
	V,
	//
	@FlyField(name = "WAN")
	W;
}
