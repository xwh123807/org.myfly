package org.myfly.platform.core.viewmodel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyMetaEntity;
import org.myfly.platform.core.viewmodel.service.IFlyViewModel;

@Entity
@Table(name = "PT_WINDOW")
@FlyTable(name = "Window", description = "Data entry or display window", isHighVolume = true, isCentrallyMaintained = true)
@FlyRefTable(apiName = "windowID", name = "Window", keyColumn = "windowID", displayColumn = "name")
public class PWindow extends FlyMetaEntity implements IFlyViewModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1215729018901191338L;

	@Id
	@Column(length = 32, name = "WindowID")
	private String windowID;

	@Column(length = 50, unique = true)
	private String apiName;

	@Column(name = "EntityType")
	private String entityType;

	@Column(name = "IsBetaFunctionality")
	private Boolean isBetaFunctionality;

	@Column(name = "IsDefault")
	private Boolean isDefault;

	@Column(name = "IsSOTrx")
	private Boolean isSOTrx;

	@Column
	private Boolean processing;

	@Column(name = "WindowType")
	private WindowType windowType;

	@Column(name = "WinHeight")
	private Integer winHeight;

	@Column(name = "WinWidth")
	private Integer winWidth;

	@Column(length = 32)
	private String imageID;

	@Column(length = 32)
	private String colorID;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#getIsSOTrx()
	 */
	@Override
	public Boolean getIsSOTrx() {
		return isSOTrx;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#setIsSOTrx(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsSOTrx(Boolean isSOTrx) {
		this.isSOTrx = isSOTrx;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#getEntityType()
	 */
	@Override
	public String getEntityType() {
		return entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewModel#setEntityType(org.myfly.
	 * platform.core3.domain.EntityType)
	 */
	@Override
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewModel#getIsBetaFunctionality()
	 */
	@Override
	public Boolean getIsBetaFunctionality() {
		return isBetaFunctionality;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewModel#setIsBetaFunctionality(java
	 * .lang.String)
	 */
	@Override
	public void setIsBetaFunctionality(Boolean isBetaFunctionality) {
		this.isBetaFunctionality = isBetaFunctionality;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#getIsDefault()
	 */
	@Override
	public Boolean getIsDefault() {
		return isDefault;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewModel#setIsDefault(java.lang.
	 * Boolean)
	 */
	@Override
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#getProcessing()
	 */
	@Override
	public Boolean getProcessing() {
		return processing;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewModel#setProcessing(java.lang.
	 * Boolean)
	 */
	@Override
	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#getWindowType()
	 */
	@Override
	public WindowType getWindowType() {
		return windowType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewModel#setWindowType(org.myfly.
	 * platform.core3.model.view.WindowType)
	 */
	@Override
	public void setWindowType(WindowType windowType) {
		this.windowType = windowType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#getWinHeight()
	 */
	@Override
	public Integer getWinHeight() {
		return winHeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.model.view.IFlyViewModel#setWinHeight(java.lang.
	 * Integer)
	 */
	@Override
	public void setWinHeight(Integer winHeight) {
		this.winHeight = winHeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#getWinWidth()
	 */
	@Override
	public Integer getWinWidth() {
		return winWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.model.view.IFlyViewModel#setWinWidth(java.lang.
	 * Integer)
	 */
	@Override
	public void setWinWidth(Integer winWidth) {
		this.winWidth = winWidth;
	}

	@Override
	public String getWindowID() {
		return windowID;
	}

	@Override
	public void setWindowID(String windowID) {
		this.windowID = windowID;
	}

	/**
	 * @return the apiName
	 */
	public String getApiName() {
		return apiName;
	}

	/**
	 * @param apiName
	 *            the apiName to set
	 */
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

}
