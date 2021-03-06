package org.myfly.platform.tools.codebuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.Modifier;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyTable;

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
		return Util.toTableApiName(getTableName());
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

	@SuppressWarnings("unchecked")
	public List<ADColumn> getColumns() {
		return (List<ADColumn>) get("columns");
	}

	public AnnotationSpec getTableAnnotation() {
		return AnnotationSpec.builder(Table.class).addMember("name", "$S", Util.toTableName(getTableName())).build();
	}

	public void build(Builder builder) {
		builder.addModifiers(Modifier.PUBLIC).addAnnotation(Entity.class).addAnnotation(getTableAnnotation())
				.addAnnotation(getFlyTableAnnotaion());
		getColumns().forEach(column -> {
			if (!column.isFlyEntityField()) {
				column.build(builder);
			}
		});
	}

	private AnnotationSpec getFlyTableAnnotaion() {
		return AnnotationSpec.builder(FlyTable.class).addMember("name", "$S", convertStr(getName()))
				.addMember("description", "$S", convertStr(getDescription()))
				.addMember("help", "$S", convertStr(getHelp())).build();
	}

}
