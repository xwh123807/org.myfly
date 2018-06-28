package org.myfly.platform.tools.codebuilder;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.lang.model.element.Modifier;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.metadata.annotation.FlyTable;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;

public class EntityCodeBuilder extends AbstractCodeBuilder {

	@Override
	public void prepare() {
		setSources(getData("eevolution.AD_Table"));
		List<Map<String, Object>> columns = getData("eevolution.AD_Column");
		getSources().forEach(table -> {
			BigDecimal table_id = (BigDecimal) table.get("ad_table_id");
			List<Map<String, Object>> tableColumns = columns.stream()
					.filter(row -> table_id.equals(row.get("ad_table_id"))).collect(Collectors.toList());
			table.put("columns", tableColumns);
		});
	}

	private AnnotationSpec getAnnotationSpec(Class type, Map<String, Object> map, String names[]) {
		com.squareup.javapoet.AnnotationSpec.Builder spec = AnnotationSpec.builder(type);
		for (String name : names) {
			spec.addMember(name, "$S", map.get(name));
		}
		return spec.build();
	}

	private AnnotationSpec getFlyTableSpec(Map<String, Object> table) {
		com.squareup.javapoet.AnnotationSpec.Builder spec = AnnotationSpec.builder(FlyTable.class);
		for (String name : new String[] { "name", "description", "help" }) {
			spec.addMember(name, "$S", table.get(name));
		}
		return spec.build();
	}

	@Override
	public void generateCodes() {
		getSources().forEach(table -> {
			String entityName = (String) table.get("tablename");
			Builder builder = TypeSpec.classBuilder(entityName).addModifiers(Modifier.PUBLIC)
					.addAnnotation(AnnotationSpec.builder(Entity.class).build())
					.addAnnotation(AnnotationSpec.builder(Table.class).addMember("name", "$S", entityName).build())
					.addAnnotation(getFlyTableSpec(table));
			List<Map<String, Object>> columns = (List<Map<String, Object>>) table.get("columns");
			columns.forEach(column -> {
				String columnName = (String) column.get("columnname");
				FieldSpec fieldSpec = FieldSpec.builder(String.class, columnName, Modifier.PRIVATE)
						.addAnnotation(Column.class).build();
				builder.addField(fieldSpec);
			});

			JavaFile javaFile = JavaFile.builder(getPackageName(), builder.build()).build();
			try {
				javaFile.writeTo(System.out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

}
