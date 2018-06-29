package org.myfly.platform.tools.codebuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.Modifier;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.metadata.annotation.FlyTable;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.TypeSpec.Builder;

public class ADTable extends ADElement {

	public ADTable(Map<String, Object> from) {
		super(from);
	}

	public ADTable() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6886616818372703001L;

	@Override
	public String getApiName() {
		return getTableName().substring(0, 1).toLowerCase() + getTableName().substring(1);
	}

	@Override
	public String getClassName() {
		return getTableName();
	}

	public String getTableName() {
		return (String) get("tablename");
	}
	

	public void setTableName(String value) {
		put("tablename", value);
	}

	public int getTableId() {
		return ((BigDecimal) get("ad_table_id")).intValue();
	}

	public void setPackageName(String packageName) {
		put("packageName", packageName);
	}

	public String getPackageName() {
		return (String) get("packageName");
	}

	public void setColumns(List<ADColumn> list) {
		put("columns", list);
	}

	public List<ADColumn> getColumns() {
		return (List<ADColumn>) get("columns");
	}

	public AnnotationSpec getTableAnnotation() {
		return AnnotationSpec.builder(Table.class).addMember("name", "$S", getTableName()).build();
	}

	public void build(Builder builder) {
		builder.addModifiers(Modifier.PUBLIC).addAnnotation(Entity.class).addAnnotation(getTableAnnotation())
				.addAnnotation(getFlyTableAnnotaion());
		getColumns().forEach(column -> {
			column.build(builder);
		});
	}

	private AnnotationSpec getFlyTableAnnotaion() {
		return AnnotationSpec.builder(FlyTable.class).addMember("name", "$S", getName())
				.addMember("description", "$S", getDescription()).addMember("help", "$S", getHelp()).build();
	}

}
