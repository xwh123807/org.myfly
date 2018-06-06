package org.myfly.platform.core.flydata.service;

import java.util.HashMap;

import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.springframework.util.Base64Utils;

/**
 * Fly Entity实体查询结果，FlyDataService会将结果增强<br>
 * 1、统一转换为字符型 <br>
 * 2、增加增强数据类型处理 <br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyEntityMap extends HashMap<String, String> {
	
	public FlyEntityMap() {
	}

	/**
	 * 从实体类构建
	 * @param entity
	 */
	public FlyEntityMap(final Object entity) {
		EntityClassUtil.getEntityFieldInfo(entity.getClass()).values().forEach(field -> {
			Object value = null;
			try {
				value = field.getGetter().invoke(entity);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (value != null) {
				String toStr = null;
				if (value instanceof byte[]) {
					toStr = Base64Utils.encodeToString((byte[]) value);
				}else {
					toStr = ClassUtil.convertValueToString(value);
				}
				put(field.getField().getName(), toStr);
			}
		});
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6081894534159363543L;

}
