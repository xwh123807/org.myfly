package org.myfly.platform.core3.model.security;

import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

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
