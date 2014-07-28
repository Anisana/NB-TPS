package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Support;
import com.netbuilder.tps.services.SupportService;

@Stateless
public class SupportServiceBean implements SupportService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Support createSupport(Support support) {
		return em.merge(support);
	}

	@Override
	public Support readSupport(Object id) {
		return em.find(com.netbuilder.tps.entity.Support.class, id);
	}

	@Override
	public Support updateSupport(Support support) {
		return em.merge(support);
	}

	@Override
	public void removeSupport(Support support) {
		em.remove(em.merge(support));
	}

}

//
//return em.merge(group);
//return em.find(com.netbuilder.tps.entity.Group.class, id);
//return em.merge(group);
//em.remove(em.merge(group));
