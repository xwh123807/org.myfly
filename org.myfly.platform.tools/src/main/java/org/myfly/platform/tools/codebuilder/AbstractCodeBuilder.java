package org.myfly.platform.tools.codebuilder;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec.Builder;

public abstract class AbstractCodeBuilder<T> {
	/**
	 * 生成代码存放路径
	 */
	private String path;
	/**
	 * 代码包名
	 */
	private String packageName;
	
	private List<T> sources;
	
	@Autowired
	private ADEmpiereRepostory repository;
	

	public AbstractCodeBuilder() {
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public ADEmpiereRepostory getRepository() {
		return repository;
	}

	public void setRepository(ADEmpiereRepostory repository) {
		this.repository = repository;
	}
	
	public void toFile(String packageName, Builder builder) {
		JavaFile javaFile = JavaFile.builder(packageName, builder.build()).build();
		try {
			javaFile.writeTo(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 生成代码
	 */
	public abstract void generateCodes();
	
	/**
	 * 准备数据，为sources赋值
	 */
	public abstract void parareData();

	public List<T> getSources() {
		return sources;
	}

	public void setSources(List<T> sources) {
		this.sources = sources;
	}
	
	public void validate() {
		Assert.notEmpty(getSources(), "sources不能为空");
	}
}
