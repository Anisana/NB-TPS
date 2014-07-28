package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Color;
import com.netbuilder.tps.services.ColorService;

@Stateless
public class ColorServiceBean implements ColorService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Color createColor(Color color) {
		return em.merge(color);
	}

	@Override
	public Color readColor(Object id) {
		return em.find(com.netbuilder.tps.entity.Color.class, id);
	}

	@Override
	public Color updateColor(Color color) {
		return em.merge(color);
	}

	@Override
	public void removeColor(Color color) {
		em.remove(em.merge(color));
	}
}
