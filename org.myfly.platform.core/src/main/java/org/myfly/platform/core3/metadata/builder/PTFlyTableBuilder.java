package org.myfly.platform.core3.metadata.builder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.metadata.model.PColumn;
import org.myfly.platform.core3.metadata.model.PTable;

public class PTFlyTableBuilder extends FlyTableDefinition{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1049487663687606420L;

	public PTFlyTableBuilder(PTable table) {
		buildFieldDefintions(table.getColumns());
	}

	private void buildFieldDefintions(Set<PColumn> columns) {
		Map<String, FlyFieldDefinition> fields = new LinkedHashMap<>();
		columns.stream().map(item -> new PTFlyFieldBuilder(item)).forEach(builder -> {
			fields.put(builder.getApiName(), new FlyFieldDefinition(builder));
		});
		setFlyFields(fields);
	}
}
