package org.myfly.platform.core.datamodel.define;

public interface IValueHandler {

	Object getFieldValue(Object entityObj);

	void setFieldValue(Object entity, Object value);

}
