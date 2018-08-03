package org.myfly.platform.core3.model;

import org.myfly.platform.core3.datamodel.annotation.FlyField;
import org.myfly.platform.core3.datamodel.annotation.FlyTable;

@FlyTable(name="Notification Type", description="Type of Notifications", help="Emails or Notification sent out for Request Updates, etc.")
public enum NotificationType {
	@FlyField(name="EMail+Notice")
	B,
	//
	@FlyField(name="EMail")
	E,
	//
	@FlyField(name="Notice")
	N,
	//
	@FlyField(name="None")
	X;
}
