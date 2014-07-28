package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Status;
import com.netbuilder.tps.services.StatusService;

@Stateless
public class StatusServiceBean implements StatusService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Status createStatus(Status status) {
		return em.merge(status);
	}

	@Override
	public Status readStatus(Object id) {
		return em.find(com.netbuilder.tps.entity.Status.class, id);
	}

	@Override
	public Status updateStatus(Status status) {
		return em.merge(status);
	}

	@Override
	public void removeStatus(Status status) {
		em.remove(em.merge(status));
	}
}
