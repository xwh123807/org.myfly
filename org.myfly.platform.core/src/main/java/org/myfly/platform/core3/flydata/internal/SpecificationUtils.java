package org.myfly.platform.core3.flydata.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.Predicate;

import org.apache.commons.collections4.MapUtils;
import org.myfly.platform.core3.datamodel.define.FlyDataModel;
import org.springframework.data.jpa.domain.Specification;

public class SpecificationUtils {
	/**
	 * 根据查询条件构造查询，条件全部都是And关系
	 * 
	 * @param params
	 * @return
	 */
	public static Specification<?> toSpecification(final FlyDataModel dataModel, final Map<String, Object> params) {
		if (MapUtils.isNotEmpty(params)) {
			return (root, query, cb) -> {
				List<Predicate> predicates = new ArrayList<>();
				for (Map.Entry<String, Object> item : params.entrySet()) {
					predicates.add(cb.equal(root.get(item.getKey()), item.getValue()));
				}
				return query.where(predicates.toArray(new Predicate[] {})).getRestriction();
			};
		} else {
			return null;
		}
	}
}
