package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Avalability;
import com.netbuilder.tps.services.AvailabilityService;

@Stateless
public class AvailabilityServiceBean implements AvailabilityService {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Avalability createAvalability(Avalability avalability) {
		return em.merge(avalability);
	}

	@Override
	public Avalability readAvalability(Object id) {
		return em.find(com.netbuilder.tps.entity.Avalability.class, id);
	}

	@Override
	public Avalability updateAvalability(Avalability avalability) {
		return em.merge(avalability);
	}

	@Override
	public void removeAvalability(Avalability avalaibility) {
		em.remove(em.merge(avalaibility));
	}
}

