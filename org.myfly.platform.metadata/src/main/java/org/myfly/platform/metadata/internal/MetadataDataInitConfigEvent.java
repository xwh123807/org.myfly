package org.myfly.platform.metadata.internal;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.service.IEntitySerivce;
import org.myfly.platform.metadata.service.IMetadataRepository;
import org.myfly.platform.system.core.domain.DBType;
import org.myfly.platform.system.core.domain.MDataSource;
import org.myfly.platform.system.core.domain.Menu;
import org.myfly.platform.system.core.service.AppStartLevel;
import org.myfly.platform.system.core.service.IAppConfigEvent;
import org.myfly.platform.system.core.service.IMenuService;
import org.myfly.platform.system.data.service.IJpaAccessService;
import org.myfly.platform.system.metadata.internal.JsonEntityMetaData;
import org.myfly.platform.system.metadata.service.IMetaDataRegister;
import org.myfly.platform.system.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetadataDataInitConfigEvent implements IAppConfigEvent {
	private static Log log = LogFactory.getLog(MetadataDataInitConfigEvent.class);
	@Autowired
	private IEntitySerivce entityServer;

	@Autowired
	private IMetadataRepository dbMetadataRepository;

	@Autowired
	private IJpaAccessService dataService;

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void registerMenus(IMenuService menuService) {
		URL url = getClass().getResource("/config/metadataMenuConfig.json");
		menuService.registerMenus(url);
		
		Menu menu = new Menu();
		menu.setUid(UUIDUtil.newUUID());
		menu.setName("外部模型");
		Set<Menu> subMenus = new HashSet<>();
		dbMetadataRepository.getTables(getDataSourceForEmbedDerby(), false).forEach(new Consumer<MTable>() {

			@Override
			public void accept(MTable table) {
				Menu item = new Menu();
				item.setUid(UUIDUtil.newUUID());
				item.setParent(menu);
				item.setName(table.getName());
				item.setUrl("/vp/list/" + table.getEntityName());
				subMenus.add(item);
			}
		});
		menu.setSubMenus(subMenus);
		dataService.saveEntity(menu);
	}

	@Override
	public void initSysData() {
		entityServer.initEntityMetadata();
	}

	@Override
	public void initSampleData() {
	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {
		MDataSource ds = getDataSourceForEmbedDerby();
		dataService.saveEntity(ds);
		List<MTable> tables = new ArrayList<>();
		dbMetadataRepository.getTables(ds, false).forEach(new Consumer<MTable>() {

			@Override
			public void accept(MTable table) {
				tables.add(dbMetadataRepository.getTable(ds, table.getTableName()));
			}
		});
		dataService.batchSaveEntity(tables);
		// 元模型写入文件
		String path = FileUtils.getTempDirectoryPath() + UUIDUtil.newUUID() + File.separatorChar;
		tables.forEach(new Consumer<MTable>() {

			@Override
			public void accept(MTable table) {
				JsonEntityMetaData meta = dbMetadataRepository.getTableJsonMetaData(ds, table.getTableName());
				String json = meta.toJson();
				try {
					String fileName = path + meta.getEntityName() + ".json";
					FileUtils.writeStringToFile(new File(fileName), json);
					metaDataRegister.registerMeta(meta.getEntityName(), fileName);
					log.info("保存元模型文件：" + fileName);
				} catch (IOException e) {
					log.error("保存元模型失败：" + e.getMessage());
				}
			}
		});
	}

	private MDataSource getDataSourceForEmbedDerby() {
		MDataSource ds = new MDataSource();
		ds.setUid(UUIDUtil.newUUID());
		ds.setName("测试数据源");
		
//		ds.setDbType(DBType.DERBY_EMBEDDED);
//		ds.setUrl("jdbc:derby:memory:myfly;create=true");
//		ds.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
//		ds.setDialect("org.hibernate.dialect.DerbyDialect");
//		ds.setUsername("sa");
//		ds.setPassword("sa");
		
		
		ds.setDbType(DBType.MYSQL);
		ds.setUrl("jdbc:mysql://192.168.99.100/myfly");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setDialect("org.hibernate.dialect.MySQLDialect");
		ds.setUsername("root");
		ds.setPassword("password");
		
		return ds;
	}
}
