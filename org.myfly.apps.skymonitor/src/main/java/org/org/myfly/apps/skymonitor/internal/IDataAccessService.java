package org.org.myfly.apps.skymonitor.internal;

import java.util.List;

import org.org.myfly.apps.skymonitor.domain.AccessLog;

public interface IDataAccessService {

	void saveEntities(List<AccessLog> entities);

}
