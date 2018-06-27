package org.myfly.platform.core3.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.metadata.service.IFlyColumn;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyViewModel;
import org.myfly.platform.core3.model.view.PWindow;

/**
 * AD_Ref_Table
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_Ref_Table")
@FlyTable(name = "")
public class PRefTable extends FlyEntity {
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PColumn.class)
	private IFlyColumn displayColumn;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PColumn.class)
	private IFlyColumn keyColumn;

	@ManyToOne(fetch = FetchType.LAZY)
	private PReference reference;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PTable.class)
	private IFlyDataModel table;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PWindow.class)
	private IFlyViewModel window;

	@Column(length = 2000)
	private String displaySQL;

	@Column
	private Boolean isAlert;

	@Column
	private Boolean isDisplayIdentifier;

	@Column
	private Boolean isValueDisplayed;

	@Column(length = 2000)
	private String orderByClause;

	@Column(length = 2000)
	private String whereClause;
}
