package org.myfly.platform.metamodel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.metamodel.annotation.FieldSetView;
import org.myfly.platform.metamodel.annotation.FieldView;
import org.myfly.platform.metamodel.annotation.FormView;
import org.myfly.platform.metamodel.annotation.ListView;
import org.myfly.platform.metamodel.annotation.MetaDataView;
import org.myfly.platform.metamodel.annotation.SectionView;
import org.myfly.platform.metamodel.annotation.TableView;

/**
 * 枚举值
 * 
 * @author xiangwanhong
 *
 */

@Entity
@Table(schema = SchemaConstants.PB)
@MetaDataView(tableView = @TableView(title = "枚举值") ,
//
listViews = { @ListView(fields = { "name", "isDefault", "createdBy" }, listStyle = ListStyle.TABLE) },
//
formViews = { @FormView(sections = { @SectionView(fieldSets = { @FieldSetView(fields = { "name", "isDefault" }) }),
		@SectionView(type = SectionType.NOTE), @SectionView(type = SectionType.ATTACHMENT) }) })
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class EnumValue extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8229221002232821733L;

	@FieldView(title = "是否首选")
	@Column
	private Boolean isDefault;

	@FieldView(title = "枚举类型")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private EnumType enumType;

	public EnumType getEnumType() {
		return enumType;
	}

	public void setEnumType(EnumType enumType) {
		this.enumType = enumType;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
}
