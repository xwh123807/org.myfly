package org.myfly.platform.core.metadata.define;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.OutlineView;

public class MetaDataDefinition extends BaseDenifition {
	private TableDefinition tableDefinition;

	private FormDefinition[] formDefinitions;

	private ListDefinition[] listDefinitions;

	private OutlineDefinition[] outlineDefinitions;

	public MetaDataDefinition(MetaDataView view) {
		setTableDefinition(new TableDefinition(view.tableView()));
		setListDefinitionsFromView(view.listViews());
		setFormDefinitionsFormView(view.formViews());
		setOutlineDefinitionsFromView(view.outlineViews());
	}

	private void setOutlineDefinitionsFromView(OutlineView[] outlineViews) {
		setOutlineDefinitions(Stream.of(outlineViews).map(view -> new OutlineDefinition(view))
				.collect(Collectors.toList()).toArray(new OutlineDefinition[] {}));
	}

	private void setFormDefinitionsFormView(FormView[] formViews) {
		setFormDefinitions(Stream.of(formViews).map(view -> new FormDefinition(view)).collect(Collectors.toList())
				.toArray(new FormDefinition[] {}));
	}

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

}
