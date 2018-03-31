package org.myfly.platform.metadata.service;

import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.system.domain.TableMapping;

public interface IEntitySerivce {

	void initEntityMetadata();

	void saveMetaData(TableMapping stableMapping, MTable mtable);
}
