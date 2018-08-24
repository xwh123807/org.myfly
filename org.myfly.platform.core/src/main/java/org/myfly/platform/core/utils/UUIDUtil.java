package org.myfly.platform.core.utils;

import java.util.UUID;

import org.hibernate.id.UUIDHexGenerator;

public class UUIDUtil {
	private static UUIDHexGenerator uuidGenerator = new UUIDHexGenerator();

	public static String newUUID32() {
		return (String) uuidGenerator.generate(null, null);
	}

	public static String newHtmlID() {
		return "H" + newUUID();
	}

	public static String newUUID() {
		int machineId = 1;// 最大支持1-9个集群机器部署
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if (hashCodeV < 0) {// 有可能是负数
			hashCodeV = -hashCodeV;
		}
		return machineId + String.format("%015d", hashCodeV);
	}
}
