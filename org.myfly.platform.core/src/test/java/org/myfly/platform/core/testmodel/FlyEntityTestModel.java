package org.myfly.platform.core.testmodel;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;

/**
 * 支持级联
 * @author xiangwanhong
 *
 */
public class FlyEntityTestModel {
	/**
	 * 用于测试新增的实体，预先构造好数据
	 */
	private Master testEntity;
	/**
	 * 用于测试修改的实体
	 */
	private Master changedEntity;
	/**
	 * 测试新增后实体，数据库查询返回期望的结果
	 */
	private FlyEntityResult flyTestEntity;
	private FlyEntityResult flyTestEntityWithActions;
	/**
	 * 测试修改后实体,数据库查询返回期望的结果
	 */
	private FlyEntityResult flyChangedEntity;
	private FlyEntityResult flyChangedEntityWithActions;

	public FlyEntityTestModel() {
	}

	private String uid = UUIDUtil.newUUID();
	
	private String subUid = UUIDUtil.newUUID();
	
	/**
	 * 构建测试实体，以及查询返回的增强实体
	 */
	public void buildTestModelEntities() {
		setTestEntity(newTestEntity());
		setChangedEntity(newChangedEntity());
		setFlyTestEntity(newFlyEntity(getTestEntity()));
		setFlyTestEntityWithActions(newFlyEntityWithActions(getTestEntity()));
		setFlyChangedEntity(newFlyEntity(getChangedEntity()));
		setFlyChangedEntityWithActions(newFlyEntityWithActions(getChangedEntity()));
	}

	private Master newTestEntity() {
		Master entity = new Master();
		entity.setUid(uid);
		entity.setName("name");
		entity.setDescription("description");
		entity.setUrl("http://www.myfly.com");
		entity.setPercent((float) 51.56);
		entity.setText("text");
		entity.setFile("this is a file".getBytes());
		entity.setLocation("location");
		entity.setTelphone("4499888");
		entity.setFax("4499666");
		entity.setEmail("admin@myfly.com");
		entity.setRichText("rich text");
		entity.setDate(DateUtil.nowSqlDate());
		entity.setTime(DateUtil.nowSqlTime());
		entity.setDataType(FieldDataType.MONEY);
		entity.setActive(false);
		entity.setCreated(DateUtil.nowSqlTimestamp());
		Set<Detail> details = new HashSet<>();
		Detail detail = new Detail();
		detail.setUid(subUid);
		detail.setMaster(entity);
		detail.setCreated(DateUtil.nowSqlTimestamp());
		detail.setDataType(FieldDataType.DATETIME);
		detail.setTitle("title");
		details.add(detail);
		entity.setDetails(details);
		Detail detail1 = new Detail();
		detail1.setUid(uid);
		detail1.setCreated(DateUtil.nowSqlTimestamp());
		detail1.setDataType(FieldDataType.SEARCHRELATION);
		detail1.setTitle("detail title");
		entity.setDetail1(detail1);
		return entity;
	}

	private FlyEntityResult newFlyEntity(Master from) {
		FlyEntityResult entity = new FlyEntityResult(from);
		// 处理增强字段
		entity.put("dataType__label", from.getDataType().getTitle());
		entity.put("url__link", "<a href='" + from.getUrl() + "'>" + from.getUrl() + "</a>");
		entity.put("name__link", "<a href=\"/vp/" + from.getClass().getName() + "/" + uid
				+ "?view=all\" target=\"\" title=\"查看\"> " + from.getName() + "</a>");
		return entity;
	}

	/**
	 * <a href=
	 * "/vp/org.myfly.platform.core.testmodel.Master/40289f6563d568df0163d568e43209f6?view=all"
	 * target="" title="查看"> 查看</a><br>
	 * <a href=
	 * "/vp/org.myfly.platform.core.testmodel.Master/40289f6563d568df0163d568e43209f6?form?view=all"
	 * target="" title="编辑"> 编辑</a><br>
	 * <a href=
	 * "/vp/org.myfly.platform.core.testmodel.Master/40289f6563d568df0163d568e43209f6?view=all"
	 * target="" title="删除"> 删除</a><br>
	 * 
	 * @param from
	 * @return
	 */
	private FlyEntityResult newFlyEntityWithActions(Master from) {
		FlyEntityResult entity = newFlyEntity(from);
		String url = "<a href=\"/vp/{0}/{1}?view=all\" target=\"\" title=\"{2}\"> {2}</a><a href=\"/vp/{0}/{1}?form?view=all\" target=\"\" title=\"{3}\"> {3}</a><a href=\"/vp/{0}/{1}?view=all\" target=\"\" title=\"{4}\"> {4}</a>";
		entity.put("actions", MessageFormat.format(url, from.getClass().getName(), uid, "查看", "编辑", "删除"));
		return entity;
	}

	private Master newChangedEntity() {
		Master entity = new Master();
		entity.setUid(uid);
		entity.setName("name changed");
		entity.setDescription("description changed");
		entity.setUrl("http://www.myfly.com.changed");
		entity.setPercent((float) 51.57);
		entity.setText("text changed");
		entity.setFile("this is a file changed".getBytes());
		entity.setLocation("location changed");
		entity.setTelphone("0755-4499888");
		entity.setFax("0755-4499666");
		entity.setEmail("admin@myfly.com");
		entity.setRichText("rich text changed");
		entity.setDate(DateUtil.nowSqlDate());
		entity.setTime(DateUtil.nowSqlTime());
		entity.setDataType(FieldDataType.TEXT);
		entity.setActive(true);
		entity.setCreated(DateUtil.nowSqlTimestamp());
		return entity;
	}

	/**
	 * 验证实体所有字段是否相同 <br>
	 * [{date=2018-06-06, created=2018-06-06 16:06:55, dataType=MONEY,
	 * description=description, active=false, richText=rich text, percent=51.56,
	 * url=http://www.myfly.com, dataType__label=币种,
	 * url__label=<a href='http://www.myfly.com'>http://www.myfly.com</a>,
	 * uid=4028b14863d4225f0163d422693209f6, file=dGhpcyBpcyBhIGZpbGU=,
	 * telphone=4499888, name=name, location=location, text=text, time=16:06:55,
	 * fax=4499666, name__link=<a href=
	 * "/vp/org.myfly.platform.core.testmodel.Master/4028b14863d4225f0163d422693209f6?view=all"
	 * target="" title="查看"> name</a>, email=admin@myfly.com}]
	 * 
	 * @param excepted
	 *            期望值
	 * @param actual
	 *            实际值
	 */
	public void assertEntityAllFields(FlyEntityResult expected, FlyEntityResult actual) {
		expected.keySet().forEach(name -> {
			Assert.assertEquals("属性[" + name + "]不一致.", expected.get(name), actual.get(name));
		});
		Assert.assertEquals(expected.size(), actual.size());
	}

	public Master getTestEntity() {
		return testEntity;
	}

	public void setTestEntity(Master testEntity) {
		this.testEntity = testEntity;
	}

	public Master getChangedEntity() {
		return changedEntity;
	}

	public void setChangedEntity(Master changedEntity) {
		this.changedEntity = changedEntity;
	}

	public FlyEntityResult getFlyTestEntity() {
		return flyTestEntity;
	}

	public void setFlyTestEntity(FlyEntityResult flyTestEntity) {
		this.flyTestEntity = flyTestEntity;
	}

	public FlyEntityResult getFlyChangedEntity() {
		return flyChangedEntity;
	}

	public void setFlyChangedEntity(FlyEntityResult flyChangedEntity) {
		this.flyChangedEntity = flyChangedEntity;
	}

	public FlyEntityResult getFlyTestEntityWithActions() {
		return flyTestEntityWithActions;
	}

	public void setFlyTestEntityWithActions(FlyEntityResult flyTestEntityWithActions) {
		this.flyTestEntityWithActions = flyTestEntityWithActions;
	}

	public FlyEntityResult getFlyChangedEntityWithActions() {
		return flyChangedEntityWithActions;
	}

	public void setFlyChangedEntityWithActions(FlyEntityResult flyChangedEntityWithActions) {
		this.flyChangedEntityWithActions = flyChangedEntityWithActions;
	}
}
