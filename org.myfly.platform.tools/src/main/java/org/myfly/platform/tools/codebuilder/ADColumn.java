package org.myfly.platform.tools.codebuilder;

import java.math.BigDecimal;
import java.util.Map;

import javax.lang.model.element.Modifier;
import javax.persistence.Column;

import org.myfly.platform.core3.metadata.annotation.FlyField;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec.Builder;

public class ADColumn extends ADElement {

	public ADColumn(Map<String, Object> from) {
		super(from);
	}

	public ADColumn() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5957635832769745944L;

	@Override
	public String getApiName() {
		return getColumnName().substring(0, 1).toLowerCase() + getColumnName().substring(1);
	}

	public void setFieldLength(int value) {
		put("fieldlength", value);
	}

	public void setColumnName(String value) {
		put("columnname", value);
	}

	public int getFieldLength() {
		return ((BigDecimal) get("fieldlength")).intValue();
	}

	public int getReference() {
		return ((BigDecimal) get("ad_reference_id")).intValue();
	}

	public Class getDataType() {
		return String.class;
	}

	public AnnotationSpec getFlyFieldAnnotationSpec() {
		return AnnotationSpec.builder(FlyField.class).addMember("name", "$S", getName())
				.addMember("description", "$S", getDescription()).addMember("help", "$S", getHelp()).build();
	}

	public AnnotationSpec getColumnAnnotation() {
		return AnnotationSpec.builder(Column.class).build();
	}

	public FieldSpec getFieldSpec() {
		return FieldSpec.builder(getDataType(), getApiName(), Modifier.PRIVATE)
				.addAnnotation(getFlyFieldAnnotationSpec()).addAnnotation(getColumnAnnotation()).build();
	}

	public MethodSpec getGetterMethodSpec() {
		return MethodSpec.methodBuilder("get" + getColumnName()).addModifiers(Modifier.PUBLIC).returns(getDataType())
				.addStatement("return $N", getApiName()).build();
	}

	public MethodSpec getSetterMethodSpec() {
		return MethodSpec.methodBuilder("set" + getColumnName()).addModifiers(Modifier.PUBLIC)
				.addParameter(getDataType(), "value").returns(void.class).addStatement("this.$N = value", getApiName())
				.build();
	}

	public void build(Builder builder) {
		builder.addField(getFieldSpec()).addMethod(getGetterMethodSpec()).addMethod(getSetterMethodSpec());
	}
}
