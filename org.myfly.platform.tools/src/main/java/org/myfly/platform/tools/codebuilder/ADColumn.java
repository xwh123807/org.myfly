package org.myfly.platform.tools.codebuilder;

import java.math.BigDecimal;
import java.util.Map;

import javax.lang.model.element.Modifier;
import javax.persistence.Column;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.builder.FlyDataTypeUtils;
import org.myfly.platform.core.domain.FlyDataType;

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
		return Util.toFieldApiName(getColumnName());
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

	public AnnotationSpec getFlyFieldAnnotationSpec() {
		return AnnotationSpec.builder(FlyField.class).addMember("name", "$S", convertStr(getName()))
				.addMember("description", "$S", convertStr(getDescription()))
				.addMember("help", "$S", convertStr(getHelp())).build();
	}

	public AnnotationSpec getFlyFieldAnnotationSpec2() {
		return AnnotationSpec.builder(FlyField.class).addMember("dataType", "$S", getDataType()).build();
	}

	private boolean isIDColumn() {
		return FlyDataType.ID.equals(getDataType()) || FlyDataType.Table.equals(getDataType())
				|| FlyDataType.TableDirect.equals(getDataType()) || FlyDataType.List.equals(getDataType());
	}

	public AnnotationSpec getColumnAnnotation() {
		AnnotationSpec.Builder builder = AnnotationSpec.builder(Column.class);
		if (getJavaType() == String.class) {
			builder.addMember("length", "$L", isIDColumn() ? 32 : getFieldLength());
		}
		return builder.build();
	}

	public Class<?> getJavaType() {
		return FlyDataTypeUtils.getJavaType(getDataType());
	}

	public FieldSpec getFieldSpec() {
		return FieldSpec.builder(getJavaType(), getApiName(), Modifier.PRIVATE).addAnnotation(getColumnAnnotation())
				.build();
		// .addAnnotation(getFlyFieldAnnotationSpec2()).build();
	}

	public MethodSpec getGetterMethodSpec() {
		return MethodSpec.methodBuilder("get" + getColumnName()).addModifiers(Modifier.PUBLIC).returns(getJavaType())
				.addStatement("return $N", getApiName()).build();
	}

	public MethodSpec getSetterMethodSpec() {
		return MethodSpec.methodBuilder("set" + getColumnName()).addModifiers(Modifier.PUBLIC)
				.addParameter(getJavaType(), "value").returns(void.class).addStatement("this.$N = value", getApiName())
				.build();
	}

	public void build(Builder builder) {
		builder.addField(getFieldSpec());
		// .addMethod(getGetterMethodSpec()).addMethod(getSetterMethodSpec());
	}

	private static String[] flyFields = { "created", "createdBy", "updated", "updatedBy", "isActive", "clientID",
			"orgID", "uUID" };

	public boolean isFlyEntityField() {
		return ArrayUtils.contains(flyFields, getApiName());
	}
}
