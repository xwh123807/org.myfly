package org.myfly.platform.metadata.service;

import org.myfly.platform.metadata.domain.MTable;

public interface IEntitySerivce {

	void initEntityMetadata();

	void saveMetaData(TableMapping stableMapping, MTable mtable);
}
