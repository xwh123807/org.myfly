package org.myfly.research.internal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.myfly.research.domain.Attachment;
import org.myfly.research.domain.Attachment2;
import org.myfly.research.service.AttachmentSearchRepository;
import org.myfly.research.service.IAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

/**
 * 用于验证Jpa、缓存、搜索。在实体修改、删除时，配置@CacheEvict，使缓存失效。在单个实体查询方法上，配置@Cacheable，使结果缓存
 * 
 * @author xiangwanhong
 *
 */

@Service
@Transactional
@CacheConfig(cacheNames = "attachment")
public class AttachmentService implements IAttachmentService {
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private AttachmentSearchRepository searchService;
	
	@Autowired
	private ElasticsearchTemplate searchTemplate;

	private SimpleJpaRepository<Attachment, String> getRepository() {
		return new SimpleJpaRepository<>(Attachment.class, entityManager);
	}
	
	private Attachment2 buildSearchEntity(Attachment entity){
		Attachment2 result = new Attachment2();
		result.setUid(entity.getUid());
		result.setName(entity.getName());
		return result;
	}

	@Override
	public Attachment save(Attachment entity) {
		Attachment result = getRepository().save(entity);
		searchService.save(buildSearchEntity(result));
		return result;
	}

	@Override
	@CacheEvict(key = "#entity.getUid()")
	public void delete(Attachment entity) {
		getRepository().delete(entity);
		searchService.delete(buildSearchEntity(entity));
	}

	@Override
	@CacheEvict(key = "#entity.getUid()")
	public Attachment update(Attachment entity) {
		Attachment result = getRepository().save(entity);
		searchService.save(buildSearchEntity(result));
		return result;
	}

	@Override
	@Cacheable(key = "#entity.getUid()")
	public Attachment find(Attachment entity) {
		return getRepository().findOne(entity.getUid());
	}

	@Override
	@Cacheable(key = "#uid")
	public Attachment find(String uid) {
		return getRepository().findOne(uid);
	}

	@Override
	public List<Attachment2> search(String queryString) {
		SearchQuery query = new NativeSearchQueryBuilder().build();
		return searchService.search(query).getContent();
	}

	@Override
	public Attachment findNoCache(String uid) {
		return getRepository().findOne(uid);
	}

	@Override
	public Attachment2 searchOne(String uid) {
		return searchService.findOne(uid);
	}

	/**
	 * 删除数据，并清除缓存
	 */
	@Override
	@CacheEvict(allEntries=true)
	public void deleteAll() {
		getRepository().deleteAllInBatch();
	}

	@Override
	public void deleteAllSearch() {
		searchService.deleteAll();
	}

	@Override
	public void index(Attachment entity) {
		
	}

	@Override
	public void index(Attachment2 entity) {
	}

}
