package org.myfly.platform.core3.datamodel.define;

public interface IValueHandler {

	Object getFieldValue(Object entityObj);

	void setFieldValue(Object entity, Object value);

}
