package org.myfly.platform.core.metadata.define;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OutlineView;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 元模型定义类<br>
 * 1、用于解析元模型注解@MetaDataView <br>
 * 2、能够直接序列化为json，也能从json反序列化为对象 <br>
 * 3、可直接在非实体类上定义元模型，该类为空类；@TableView中的@PropertyView中定义实体属性 <br>
 * 4、可以通过模型扩展插件从第三方系统构建元模型 <br>
 * 
 * @author xiangwanhong
 *
 */
public class MetaDataDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8826044603449054615L;

	private TableDefinition tableDefinition;

	private FormDefinition[] formDefinitions;

	private ListDefinition[] listDefinitions;

	private OutlineDefinition[] outlineDefinitions;

	public MetaDataDefinition(MetaDataView view) {
		if (view != null) {
			if (view.tableView() != null) {
				setTableDefinition(new TableDefinition(view.tableView()));
			}
			setListDefinitionsFromView(view.listViews());
			setFormDefinitionsFormView(view.formViews());
			setOutlineDefinitionsFromView(view.outlineViews());
		}else {
			setTableDefinition(new TableDefinition());
		}
	}

	public MetaDataDefinition() {
	}

	@JsonIgnore
	private void setOutlineDefinitionsFromView(OutlineView[] outlineViews) {
		setOutlineDefinitions(Stream.of(outlineViews).map(view -> new OutlineDefinition(view))
				.collect(Collectors.toList()).toArray(new OutlineDefinition[] {}));
	}

	@JsonIgnore
	private void setFormDefinitionsFormView(FormView[] formViews) {
		setFormDefinitions(Stream.of(formViews).map(view -> new FormDefinition(view)).collect(Collectors.toList())
				.toArray(new FormDefinition[] {}));
	}

	@JsonIgnore
	private void setListDefinitionsFromView(ListView[] listViews) {
		setListDefinitions(Stream.of(listViews).map(view -> new ListDefinition(view)).collect(Collectors.toList())
				.toArray(new ListDefinition[] {}));
	}

	public TableDefinition getTableDefinition() {
		return tableDefinition;
	}

	public void setTableDefinition(TableDefinition tableDefinition) {
		this.tableDefinition = tableDefinition;
	}

	public FormDefinition[] getFormDefinitions() {
		return formDefinitions;
	}

	public void setFormDefinitions(FormDefinition[] formDefinitions) {
		this.formDefinitions = formDefinitions;
	}

	public ListDefinition[] getListDefinitions() {
		return listDefinitions;
	}

	public void setListDefinitions(ListDefinition[] listDefinitions) {
		this.listDefinitions = listDefinitions;
	}

	public OutlineDefinition[] getOutlineDefinitions() {
		return outlineDefinitions;
	}

	public void setOutlineDefinitions(OutlineDefinition[] outlineDefinitions) {
		this.outlineDefinitions = outlineDefinitions;
	}

	@Override
	public String toString() {
		return "forms: " + getFormDefinitions().length + ", lists: " + getListDefinitions().length + ", outlines: "
				+ getOutlineDefinitions().length;
	}

	@Override
	public void validate() {
		Assert.notNull(getTableDefinition());
		getTableDefinition().validate();
		Stream.of(getListDefinitions()).forEach(item -> item.validate());
		Stream.of(getFormDefinitions()).forEach(item -> item.validate());
		Stream.of(getOutlineDefinitions()).forEach(item -> item.validate());
	}

}
