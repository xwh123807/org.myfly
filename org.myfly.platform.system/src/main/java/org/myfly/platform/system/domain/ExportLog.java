package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.TableView;

/**
 * 导出日志，包括导出Excel、导出Pdf、下载附件时，记录日志，并存储导出文件快照
 * @author xiangwanhong
 *
 */

@Entity
@Table(schema=SchemaConstants.PB)
@MetaDataView(tableView=@TableView(title="导出日志"))
public class ExportLog extends FlyEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6752226567083758887L;
	
	@Column
	@FieldView(title="来源")
	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
