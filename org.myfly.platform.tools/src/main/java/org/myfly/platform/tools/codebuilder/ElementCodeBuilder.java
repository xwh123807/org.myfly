package org.myfly.platform.tools.codebuilder;

import javax.lang.model.element.Modifier;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;

@Service
public class ElementCodeBuilder extends AbstractCodeBuilder<ADElement> {
	@Override
	public void parareData() {
		setSources(getRepository().getElements());
	}

	@Override
	public void validate() {
		super.validate();
		Assert.hasLength(getPackageName(), "属性packageName不能为空");
	}

	@Override
	public void generateCodes() {
		validate();
		Builder builder = TypeSpec.enumBuilder("Element").addModifiers(Modifier.PUBLIC);
		getSources().forEach(element -> {
			element.build(builder);
		});

		toFile(getPackageName(), builder);
	}
}
