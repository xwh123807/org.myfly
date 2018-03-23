package org.myfly.platform.metadata.internal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.myfly.platform.metadata.domain.MFKConstraint;
import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MIndex;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.service.IMetadataRepository;
import org.myfly.platform.system.core.domain.FieldDataType;
import org.myfly.platform.system.core.domain.MDataSource;
import org.myfly.platform.system.data.internal.ConnectionFactory;
import org.myfly.platform.system.metadata.internal.EntityMetaData;
import org.myfly.platform.system.metadata.internal.JsonEntityMetaData;
import org.myfly.platform.system.metadata.internal.JsonEntityMetaData.JsonFieldDefinition;
import org.myfly.platform.system.utils.UUIDUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service("DBMetadataRepository")
public class DBMetadataRepository extends AbstractMetadataRepository implements IMetadataRepository {

	private <T> List<T> fetchAll(MDataSource currentDataSource, Function<Connection, ResultSet> feachFunc,
			Function<ResultSet, T> mapFunc) {
		List<T> list = new ArrayList<>();
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection(currentDataSource);
			ResultSet rs = feachFunc.apply(connection);
			while (rs.next()) {
				T item = mapFunc.apply(rs);
				list.add(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			closeConnection(connection);
		}
		return list;
	}

	private <T> T fetchOne(MDataSource currentDataSource, Function<Connection, ResultSet> feachFunc,
			Function<ResultSet, T> mapFunc) {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection(currentDataSource);
			ResultSet rs = feachFunc.apply(connection);
			Assert.notNull(rs);
			rs.next();
			return mapFunc.apply(rs);
		} catch (Exception e) {
		} finally {
			closeConnection(connection);
		}
		return null;
	}

	@Override
	public List<MTable> getTables(MDataSource ds, boolean containFields) {
		List<MTable> tables = fetchAll(ds, new Function<Connection, ResultSet>() {

			@Override
			public ResultSet apply(Connection conn) {
				try {
					return conn.getMetaData().getTables(null, null, null, null);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}, new Function<ResultSet, MTable>() {

			@Override
			public MTable apply(ResultSet rs) {
				try {
					return buildTable(rs, ds.getUid());
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
		if (containFields) {
			tables.forEach(new Consumer<MTable>() {

				@Override
				public void accept(MTable table) {
					table.setFields(new HashSet<>(getFields(ds, table.getTableName()).values()));
					table.getFields().forEach(new Consumer<MField>() {

						@Override
						public void accept(MField field) {
							field.setTable(table);
						}
					});
				}
			});
		}
		return tables;
	}

	@Override
	public JsonEntityMetaData getTableJsonMetaData(MDataSource ds, String tableName) {
		Assert.notNull(ds);
		Assert.hasText(tableName);
		MTable table = getTable(ds, tableName);
		JsonEntityMetaData meta = buildMetaData(table);
		return meta;
	}

	@Override
	public EntityMetaData getTableEntityMetaData(MDataSource ds, String tableName) {
		Assert.notNull(ds);
		Assert.hasText(tableName);
		EntityMetaData metaData = getTableJsonMetaData(ds, tableName).convertToEntityMetaData();
		metaData.validate();
		return metaData;
	}

	/**
	 * TABLE_CAT String => table catalog (may be null) <br>
	 * TABLE_SCHEM String => table schema (may be null)<br>
	 * TABLE_NAME String => table name<br>
	 * TABLE_TYPE String => table type. Typical types are "TABLE", "VIEW",
	 * "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS",
	 * "SYNONYM".<br>
	 * REMARKS String => explanatory comment on the table<br>
	 * TYPE_CAT String => the types catalog (may be null)<br>
	 * TYPE_SCHEM String => the types schema (may be null)<br>
	 * TYPE_NAME String => type name (may be null)<br>
	 * SELF_REFERENCING_COL_NAME String => name of the designated "identifier"
	 * column of a typed table (may be null)<br>
	 * REF_GENERATION String => specifies how values in
	 * SELF_REFERENCING_COL_NAME are created. Values are "SYSTEM", "USER",
	 * "DERIVED". (may be null)<br>
	 * 
	 * @param resultSet
	 * @return
	 */
	private MTable buildTable(ResultSet rs, String dataSourceId) throws Exception {
		Assert.notNull(rs);
		Assert.hasLength(dataSourceId);
		MTable table = new MTable();
		table.setUid(UUIDUtil.newUUID());
		table.setDataSourceId(dataSourceId);
		table.setName(rs.getString("TABLE_NAME"));
		table.setEntityName(table.getName().toLowerCase());
		table.setTableName(rs.getString("TABLE_NAME"));
		table.setSchemaName(rs.getString("TABLE_SCHEM"));
		table.setCatalogName(rs.getString("TABLE_CAT"));
		table.setDescription(rs.getString("TABLE_TYPE") + " " + rs.getString("REMARKS"));
		return table;
	}

	private void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
	}

	public Map<String, MField> getFields(MDataSource ds, String tableName) {
		List<MField> fields = fetchAll(ds, new Function<Connection, ResultSet>() {

			@Override
			public ResultSet apply(Connection conn) {
				try {
					return conn.getMetaData().getColumns(null, null, tableName, null);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}, new Function<ResultSet, MField>() {

			@Override
			public MField apply(ResultSet rs) {
				try {
					return buildField(rs);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
		Map<String, MField> map = new LinkedHashMap<>();
		fields.forEach(new Consumer<MField>() {

			@Override
			public void accept(MField field) {
				map.put(field.getAttrName(), field);
			}
		});
		return map;
	}

	protected MField buildField(ResultSet rs) throws Exception {
		Assert.notNull(rs);
		MField field = new MField();
		field.setUid(UUIDUtil.newUUID());
		field.setName(rs.getString("COLUMN_NAME"));
		field.setAttrName(rs.getString("COLUMN_NAME").toLowerCase());
		field.setFieldName(rs.getString("COLUMN_NAME"));
		field.setDescription(rs.getString("TYPE_NAME") + " " + rs.getString("REMARKS"));
		field.setFieldDataType(FieldDataType.fromSQLType(rs.getInt("DATA_TYPE")));
		field.setLength(rs.getLong("COLUMN_SIZE"));
		return field;
	}

	public MTable getTable(MDataSource ds, String tableName) {
		MTable table = fetchOne(ds, new Function<Connection, ResultSet>() {

			@Override
			public ResultSet apply(Connection conn) {
				try {
					return conn.getMetaData().getTables(null, null, tableName, null);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}

		}, new Function<ResultSet, MTable>() {

			@Override
			public MTable apply(ResultSet rs) {
				try {
					return buildTable(rs, ds.getUid());
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
		Assert.notNull(table);
		// 获取字段定义
		Map<String, MField> fields = getFields(ds, tableName);
		fields.values().forEach(new Consumer<MField>() {

			@Override
			public void accept(MField field) {
				field.setTable(table);
			}
		});

		// 索引
		Set<MIndex> indexes = new HashSet<MIndex>(getIndexes(ds, tableName));
		indexes.forEach(new Consumer<MIndex>() {

			@Override
			public void accept(MIndex index) {
				index.setTable(table);
			}
		});
		table.setIndexes(indexes);
		// 查找关系
		List<MFKConstraint> fkConstraints = getSearchRelations(ds, tableName, table, fields);
		table.setFkConstraints(new HashSet<>(fkConstraints));

		// 处理子表
		processMDRelations(ds, tableName, table, fields);

		// 字段
		table.setFields(new HashSet<MField>(fields.values()));

		// 主键
		table.setPrimaryKeys(getPrimaryKeys(ds, tableName, fields.values()));
		return table;
	}

	/**
	 * 获取实体主子关系定义
	 * 
	 * @param ds
	 * @param tableName
	 * @param fields
	 * @param table
	 */
	private void processMDRelations(MDataSource ds, String tableName, MTable table, Map<String, MField> fields) {
		List<ConstriantKeyInfo> exportedKeys = fetchAll(ds, new Function<Connection, ResultSet>() {

			@Override
			public ResultSet apply(Connection conn) {
				try {
					return conn.getMetaData().getExportedKeys(null, null, tableName);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}, new Function<ResultSet, ConstriantKeyInfo>() {

			@Override
			public ConstriantKeyInfo apply(ResultSet rs) {
				try {
					return buildConstriantKeyInfo(rs);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
		Map<String, List<ConstriantKeyInfo>> mdRelations = new LinkedHashMap<>();
		exportedKeys.forEach(new Consumer<ConstriantKeyInfo>() {

			@Override
			public void accept(ConstriantKeyInfo info) {
				if (mdRelations.containsKey(info.name)) {
					mdRelations.get(info.name).add(info);
				} else {
					List<ConstriantKeyInfo> list = new ArrayList<>();
					list.add(info);
					mdRelations.put(info.name, list);
				}
			}
		});

		mdRelations.forEach(new BiConsumer<String, List<ConstriantKeyInfo>>() {

			@Override
			public void accept(String t, List<ConstriantKeyInfo> list) {
				list.forEach(new Consumer<ConstriantKeyInfo>() {

					@Override
					public void accept(ConstriantKeyInfo keyInfo) {
						MField field = new MField();
						field.setName("子表：" + keyInfo.fkTableName);
						field.setAttrName("sub_" + keyInfo.fkTableName);
						field.setFieldDataType(FieldDataType.FLYMDRELATION);
						field.setRelationTable(keyInfo.fkTableName);
						field.setRelationField(keyInfo.fkColumnName);
						field.setLength(0l);
						fields.put(field.getAttrName(), field);
					}

				});
			}
		});
	}

	/**
	 * 获取实体查找关系定义
	 * 
	 * @param ds
	 * @param tableName
	 */
	private List<MFKConstraint> getSearchRelations(MDataSource ds, String tableName, MTable mtable,
			Map<String, MField> fields) {
		// 取出外键，复合外键有多条记录
		List<ConstriantKeyInfo> importedKeys = fetchAll(ds, new Function<Connection, ResultSet>() {

			@Override
			public ResultSet apply(Connection conn) {
				try {
					return conn.getMetaData().getImportedKeys(null, null, tableName);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}, new Function<ResultSet, ConstriantKeyInfo>() {

			@Override
			public ConstriantKeyInfo apply(ResultSet rs) {
				try {
					return buildConstriantKeyInfo(rs);
				} catch (Exception e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
		// 按外键名称分组
		Map<String, List<ConstriantKeyInfo>> keys = new LinkedHashMap<>();
		importedKeys.forEach(new Consumer<ConstriantKeyInfo>() {

			@Override
			public void accept(ConstriantKeyInfo info) {
				if (keys.containsKey(info.name)) {
					keys.get(info.name).add(info);
				} else {
					List<ConstriantKeyInfo> list = new ArrayList<>();
					list.add(info);
					keys.put(info.name, list);
				}
			}
		});

		List<MFKConstraint> fkConstraints = new ArrayList<>();
		keys.forEach(new BiConsumer<String, List<ConstriantKeyInfo>>() {

			@Override
			public void accept(String name, List<ConstriantKeyInfo> list) {
				List<String> pkColumnNames = new ArrayList<>();
				List<String> fkColumnNames = new ArrayList<>();
				list.forEach(new Consumer<ConstriantKeyInfo>() {

					@Override
					public void accept(ConstriantKeyInfo keyInfo) {
						pkColumnNames.add(keyInfo.pkColumnName);
						fkColumnNames.add(keyInfo.fkColumnName);
					}
				});
				// 构建外键约束实体
				MFKConstraint fkConstraint = new MFKConstraint();
				fkConstraint.setUid(UUIDUtil.newUUID());
				fkConstraint.setName(name);
				fkConstraint.setPkTable(mtable);
				fkConstraint.setPkColumnNames(StringUtils.join(fkColumnNames.toArray(new String[] {}), ","));
				fkConstraint.setFkTableCat(list.get(0).pkTableCat);
				fkConstraint.setFkTableSchema(list.get(0).pkTableSchema);
				fkConstraint.setFkTableName(list.get(0).pkTableName);
				fkConstraint.setFkColumnNames(StringUtils.join(pkColumnNames.toArray(new String[] {}), ","));

				if (pkColumnNames.size() == 1) {
					fields.get(fkConstraint.getPkColumnNames()).setFieldDataType(FieldDataType.FLYSEARCHRELATION);
					fkConstraint.setPkAttrName(fkConstraint.getPkColumnNames());
				} else {
					// 当外键关联字段大于1个时，自动增加查找关系字段
					MField field = new MField();
					field.setUid(UUIDUtil.newUUID());
					field.setName(fkConstraint.getFkTableName());
					field.setAttrName(fkConstraint.getFkTableName());
					field.setFieldDataType(FieldDataType.FLYSEARCHRELATION);
					field.setRelationTable(fkConstraint.getFkTableName());
					field.setFieldName(field.getAttrName());
					field.setLength(0l);
					fields.put(field.getName(), field);
					fkConstraint.setPkAttrName(field.getAttrName());
				}
				fkConstraints.add(fkConstraint);
			}
		});

		return fkConstraints;
	}

	class IndexInfo {
		String name;
		String column;
		boolean isUnique;

		public IndexInfo(String name, String column, boolean isUnique) {
			this.name = name;
			this.column = column;
			this.isUnique = isUnique;
		}

		@Override
		public String toString() {
			return "name: " + name + ", column: " + column + ", unique: " + isUnique;
		}
	}

	class ConstriantKeyInfo {
		String pkTableCat;
		String pkTableSchema;
		String pkTableName;
		String pkColumnName;
		String fkTableCat;
		String fkTableSchema;
		String fkTableName;
		String fkColumnName;
		int keySeq;
		String name;

		@Override
		public String toString() {
			return "keySeq: " + keySeq + ", name: " + name + ", pkTableCat: " + pkTableCat + ", pkTableSchema: "
					+ pkTableSchema + ", pkTableName: " + pkTableName + ", pkColumnName: " + pkColumnName
					+ ", fkTableCat: " + fkTableCat + ", fkTableSchema: " + fkTableSchema + ", fkTableName: "
					+ fkTableName + ", fkColumnName: " + fkColumnName;
		}
	}

	private ConstriantKeyInfo buildConstriantKeyInfo(ResultSet rs) throws Exception {
		ConstriantKeyInfo info = new ConstriantKeyInfo();
		info.pkTableCat = rs.getString("PKTABLE_CAT");
		info.pkTableSchema = rs.getString("PKTABLE_SCHEM");
		info.pkTableName = rs.getString("PKTABLE_NAME");
		info.pkColumnName = rs.getString("PKCOLUMN_NAME");
		info.fkTableCat = rs.getString("FKTABLE_CAT");
		info.fkTableSchema = rs.getString("FKTABLE_SCHEM");
		info.fkTableName = rs.getString("FKTABLE_NAME");
		info.fkColumnName = rs.getString("FKCOLUMN_NAME");
		info.keySeq = rs.getInt("KEY_SEQ");
		info.name = rs.getString("FK_NAME");
		return info;
	}

	/**
	 * 获取表索引
	 * 
	 * @param ds
	 * @param tableName
	 */
	private List<IndexInfo> getIndexes(MDataSource ds, String tableName, boolean isUnique) {
		return fetchAll(ds, new Function<Connection, ResultSet>() {

			@Override
			public ResultSet apply(Connection conn) {
				try {
					return conn.getMetaData().getIndexInfo(null, null, tableName, isUnique, true);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}, new Function<ResultSet, IndexInfo>() {

			@Override
			public IndexInfo apply(ResultSet rs) {
				try {
					return new IndexInfo(rs.getString("INDEX_NAME"), rs.getString("COLUMN_NAME").toLowerCase(),
							isUnique);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
	}

	private List<MIndex> getIndexes(MDataSource ds, String tableName) {
		List<IndexInfo> indexInfos = new ArrayList<>();
		indexInfos.addAll(getIndexes(ds, tableName, true));
		// indexInfos.addAll(getIndexes(ds, tableName, false));
		Map<String, MIndex> indexes = new LinkedHashMap<>();
		for (IndexInfo indexInfo : indexInfos) {
			if (indexes.containsKey(indexInfo.name)) {
				MIndex mindex = indexes.get(indexInfo.name);
				mindex.setColumnNames(mindex.getColumnNames() + "," + indexInfo.column);
			} else {
				MIndex mindex = new MIndex();
				mindex.setUid(UUIDUtil.newUUID());
				mindex.setName(indexInfo.name);
				mindex.setUniqued(indexInfo.isUnique);
				mindex.setColumnNames(indexInfo.column);
				indexes.put(mindex.getName(), mindex);
			}
		}
		return new ArrayList<>(indexes.values());
	}

	/**
	 * 获取表主键,多个字段用逗号分隔
	 * 
	 * @param ds
	 * @param tableName
	 * @param fields
	 * @return
	 */
	private String getPrimaryKeys(MDataSource ds, String tableName, Collection<MField> fields) {
		// 获取主键
		List<String> primaryKeys = fetchAll(ds, new Function<Connection, ResultSet>() {

			@Override
			public ResultSet apply(Connection conn) {
				try {
					return conn.getMetaData().getPrimaryKeys(null, null, tableName);
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}, new Function<ResultSet, String>() {

			@Override
			public String apply(ResultSet rs) {
				try {
					return rs.getString("COLUMN_NAME").toLowerCase();
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		});
		if (CollectionUtils.isNotEmpty(primaryKeys)) {
			return StringUtils.join(primaryKeys.iterator(), ",");
		} else {
			List<MIndex> indexes = getIndexes(ds, tableName);
			if (CollectionUtils.isNotEmpty(indexes)) {
				return indexes.get(0).getColumnNames();
			} else {
				// 既没有定义主键，也没有唯一索引，则全部字段构成唯一索引
				String columns = "";
				for (MField field : fields) {
					columns += "," + field.getAttrName();
				}
				return columns.substring(1);
			}
		}
	}

}
