package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Module;
import com.netbuilder.tps.services.ModuleService;

@Stateless
public class ModuleServiceBean implements ModuleService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Module createModule(Module module) {
		return em.merge(module);
	}

	@Override
	public Module readModule(Object id) {
		return em.find(com.netbuilder.tps.entity.Module.class, id);
	}

	@Override
	public Module updateModule(Module module) {
		return em.merge(module);
	}

	@Override
	public void removeModule(Module module) {
		em.remove(em.merge(module));
	}
}
