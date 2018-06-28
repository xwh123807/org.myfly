package org.myfly.platform.tools.codebuilder;

import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;

public class ElementCodeBuilder extends AbstractCodeBuilder {
	@Override
	public void prepare() {
		setSources(getData("eevolution.AD_Element"));
	}

	@Override
	public void generateCodes() {
		Builder builder = TypeSpec.enumBuilder("Element").addModifiers(Modifier.PUBLIC);
		getSources().forEach(source -> {
			builder.addEnumConstant((String) source.get("columnname"));
			//builder.addAnnotation(AnnotationSpec.builder(FlyElement.class).build());
		});

		JavaFile javaFile = JavaFile.builder(getPackageName(), builder.build()).build();
		try {
			javaFile.writeTo(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
