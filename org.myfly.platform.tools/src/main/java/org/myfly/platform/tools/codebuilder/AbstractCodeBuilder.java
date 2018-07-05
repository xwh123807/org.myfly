package org.myfly.platform.tools.codebuilder;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.JaxbUtil;
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
	/**
	 * 类名
	 */
	private String className;
	/**
	 * 语言
	 */
	private String language;

	private List<T> sources;
	/**
	 * 语言包
	 */
	private ADEmpiereTrl empiereTrl;

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
			File file = getOutFile();
			System.out.println("生成的代码在" + file.getAbsolutePath());
			javaFile.writeTo(getOutFile());
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

	/**
	 * 
	 * @param languageTable
	 */
	public void prepareLanguage(String languageTable) {
		Assert.hasLength(languageTable);
		if (StringUtils.isNotBlank(languageTable) && !getLanguage().equalsIgnoreCase("en")) {
			String languageFileName = "/" + languageTable + "_Trl_" + getLanguage() + ".xml";
			URL url = getClass().getResource(languageFileName);
			if (url == null) {
				throw new RuntimeException("语言包[" + languageFileName + "]不存在");
			}
			setEmpiereTrl(JaxbUtil.fromXml(url, ADEmpiereTrl.class));
			getEmpiereTrl().index();
		}
	}

	/**
	 * 合并语言
	 * 
	 * @param list
	 * @param keyName
	 */
	public void mergeLanguages(List<?> list, String keyName) {
		if (getEmpiereTrl() != null) {
			list.forEach(item -> {
				Map map = (Map) item;
				int uid = ((BigDecimal) map.get(keyName)).intValue();
				ADEmpiereTrlRow row = getEmpiereTrl().getRowMap().get(String.valueOf(uid));
				if (row != null) {
					row.getValues().forEach(valueItem -> {
						map.put(valueItem.getColumn().toLowerCase(), valueItem.getValue());
					});
				}
			});
		}
	}

	public List<T> getSources() {
		return sources;
	}

	public void setSources(List<T> sources) {
		this.sources = sources;
	}

	public void validate() {
		Assert.notEmpty(getSources(), "sources不能为空");
	}

	public File getOutFile() {
		return new File(System.getProperty("user.dir") + getPath());
	}

	public File getOutFile(String packageName, String className) {
		String userDir = System.getProperty("user.dir");
		String fileName = userDir + getPath() + packageName.replaceAll("\\.", "/") + "/" + className + ".java";
		File file = new File(fileName);
		return file;
	}

	public void toFile(String packageName, String className, StringBuffer buffer) {
		File file = getOutFile(packageName, className);
		System.out.println("生成的代码在" + file.getAbsolutePath());
		try {
			FileUtils.writeByteArrayToFile(file, buffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String convertStr(String value) {
		String tmp = value.replaceAll("\n", "\t");
		tmp = tmp.replaceAll("\r", "\t");
		tmp = tmp.replaceAll("\"", "'");
		return tmp;
	}

	public String convertName(String name) {
		return name.replaceAll("-", "_").replaceAll(" ", "_").replaceAll("\\(", "_").replaceAll("\\)", "_")
				.replaceAll("/", "_");
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getLanguage() {
		if (StringUtils.isBlank(language)) {
			return "EN";
		} else {
			return language;
		}
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public ADEmpiereTrl getEmpiereTrl() {
		return empiereTrl;
	}

	public void setEmpiereTrl(ADEmpiereTrl empiereTrl) {
		this.empiereTrl = empiereTrl;
	}

	public String getClassNameWithLanguage() {
		if (StringUtils.isBlank(getLanguage())) {
			setLanguage("EN");
		}
		return getClassName() + "_" + getLanguage();
	}
}
