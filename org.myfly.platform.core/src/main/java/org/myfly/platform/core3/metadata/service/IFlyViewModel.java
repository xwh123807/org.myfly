package org.myfly.platform.core3.metadata.service;

import java.util.Set;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.model.dict.PColor;
import org.myfly.platform.core3.model.dict.PImage;
import org.myfly.platform.core3.model.view.WindowType;

public interface IFlyViewModel extends IFlyEntity {

	Boolean getIsSOTrx();

	void setIsSOTrx(Boolean isSOTrx);

	String getName();

	void setName(String name);

	EntityType getEntityType();

	void setEntityType(EntityType entityType);

	String getDescription();

	void setDescription(String description);

	String getHelp();

	void setHelp(String help);

	String getIsBetaFunctionality();

	void setIsBetaFunctionality(String isBetaFunctionality);

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

	PImage getImage();

	void setImage(PImage image);

	PColor getColor();

	void setColor(PColor color);

	Set<IFlyViewTab> getTabs();

	void setTabs(Set<IFlyViewTab> tabs);

}