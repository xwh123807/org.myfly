package org.myfly.platform.core.viewmodel.service;

import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.domain.IFlyMetaEntity;
import org.myfly.platform.core.viewmodel.model.WindowType;

public interface IFlyViewModel extends IFlyEntity, IFlyMetaEntity {
	String getWindowID();
	
	void setWindowID(String windowID);

	Boolean getIsSOTrx();

	void setIsSOTrx(Boolean isSOTrx);

	String getName();

	void setName(String name);

	String getEntityType();

	void setEntityType(String entityType);

	String getDescription();

	void setDescription(String description);

	String getHelp();

	void setHelp(String help);

	Boolean getIsBetaFunctionality();

	void setIsBetaFunctionality(Boolean isBetaFunctionality);

	Boolean getIsDefault();

	void setIsDefault(Boolean isDefault);

	Boolean getProcessing();

	void setProcessing(Boolean processing);

	WindowType getWindowType();

	void setWindowType(WindowType windowType);

	Integer getWinHeight();

	void setWinHeight(Integer winHeight);

	Integer getWinWidth();

	void setWinWidth(Integer winWidth);

}