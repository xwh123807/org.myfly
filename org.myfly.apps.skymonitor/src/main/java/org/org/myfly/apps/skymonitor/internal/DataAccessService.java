package org.org.myfly.apps.skymonitor.internal;

import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.org.myfly.apps.skymonitor.domain.AccessLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataAccessService implements IDataAccessService {
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void saveEntities(List<AccessLog> entities) {
		entities.forEach(new Consumer<AccessLog>() {

			@Override
			public void accept(AccessLog entity) {
				try {
					entityManager.persist(entity);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
