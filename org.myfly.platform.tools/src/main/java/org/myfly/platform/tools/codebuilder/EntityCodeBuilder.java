package org.myfly.platform.tools.codebuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;

@Component
public class EntityCodeBuilder extends AbstractCodeBuilder<ADTable> {
	private PackageTable[] packages;

	@Override
	public void parareData() {
		List<ADTable> tables = new ArrayList<>();
		Stream.of(packages).forEach(item -> {
			for (String tableName : item.getTableNames()) {
				ADTable table = getRepository().getTable(tableName);
				table.setPackageName(item.getPackageName());
				table.setColumns(getRepository().getTableColumns(table.getTableId()));
				tables.add(table);
			}
		});
		setSources(tables);
	}

	@Override
	public void generateCodes() {
		validate();
		getSources().forEach(table -> {
			Builder builder = TypeSpec.classBuilder(table.getApiName());
			table.build(builder);
			toFile(table.getPackageName(), builder);
		});
	}

	public PackageTable[] getPackages() {
		return packages;
	}

	public void setPackages(PackageTable[] packages) {
		this.packages = packages;
	}

	@Override
	public void validate() {
		super.validate();
		Assert.notEmpty(getPackages(), "属性packages不能为空");
	}
}
