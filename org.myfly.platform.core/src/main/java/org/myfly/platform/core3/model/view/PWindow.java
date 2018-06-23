package org.myfly.platform.core3.model.view;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.dict.PColor;
import org.myfly.platform.core3.model.dict.PImage;

@Entity
@Table(name = "PT_WINDOW")
@FlyTable(name = "Window", description = "Data entry or display window", isHighVolume = true, isCentrallyMaintained = true)
public class PWindow extends FlyEntity {
	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;

	@FlyField(name = "Entity Type", dataType = FlyDataType.Table, description = "Dictionary Entity Type; Determines ownership and synchronization", help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  \n"
			+ "\n" + "For customizations, copy the entity and select \"User\"!")
	@Column(name = "EntityType")
	private EntityType entityType;

	@FlyField(name = "Description", description = "Optional short description of the record", help = "A description is limited to 255 characters.")
	@Column(length = 255)
	private String description;

	@FlyField(name = "Comment/Help", dataType = FlyDataType.Text, description = "Comment or Hint", help = "The Help field contains a hint, comment or help about the use of this item.")
	@Column(length = 2000)
	private String help;

	@FlyField(name = "Beta Functionality", description = "This functionality is considered Beta", help = "Beta functionality is not fully tested or completed.")
	@Column(name = "IsBetaFunctionality")
	private String IsBetaFunctionality;

	@FlyField(name = "Default", description = "Default value", help = "The Default Checkbox indicates if this record will be used as a default value.")
	@Column(name = "IsDefault")
	private Boolean isDefault;

	@FlyField(name = "Sales Transaction", defaultValue = "Y", description = "This is a Sales Transaction", help = "The Sales Transaction checkbox indicates if this item is a Sales Transaction.")
	@Column(name = "IsSOTrx")
	private Boolean isSOTrx;

	@FlyField(name = "Process Now")
	@Column
	private Boolean processing;

	@FlyField(name = "WindowType", description = "Type or classification of a Window", help = "The Window Type indicates the type of window being defined (Maintain, Transaction or Query)")
	@Column(name = "WindowType")
	private WindowType windowType;

	@FlyField(name = "Window Height")
	@Column(name = "WinHeight")
	private Integer winHeight;

	@FlyField(name = "Window Width")
	@Column(name = "WinWidth")
	private Integer winWidth;

	@ManyToOne(fetch = FetchType.LAZY)
	private PImage image;

	@ManyToOne(fetch = FetchType.LAZY)
	private PColor color;

	@OneToMany(mappedBy = "window", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private Set<PTab> tabs;

	public Boolean getIsSOTrx() {
		return isSOTrx;
	}

	public void setIsSOTrx(Boolean isSOTrx) {
		this.isSOTrx = isSOTrx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getIsBetaFunctionality() {
		return IsBetaFunctionality;
	}

	public void setIsBetaFunctionality(String isBetaFunctionality) {
		IsBetaFunctionality = isBetaFunctionality;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	public WindowType getWindowType() {
		return windowType;
	}

	public void setWindowType(WindowType windowType) {
		this.windowType = windowType;
	}

	public Integer getWinHeight() {
		return winHeight;
	}

	public void setWinHeight(Integer winHeight) {
		this.winHeight = winHeight;
	}

	public Integer getWinWidth() {
		return winWidth;
	}

	public void setWinWidth(Integer winWidth) {
		this.winWidth = winWidth;
	}

	public PImage getImage() {
		return image;
	}

	public void setImage(PImage image) {
		this.image = image;
	}

	public PColor getColor() {
		return color;
	}

	public void setColor(PColor color) {
		this.color = color;
	}

	public Set<PTab> getTabs() {
		return tabs;
	}

	public void setTabs(Set<PTab> tabs) {
		this.tabs = tabs;
	}
}
