package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Group;
import com.netbuilder.tps.services.GroupService;

@Stateless
public class GroupServiceBean implements GroupService {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Group createGroup(Group group) {
		return em.merge(group);
	}

	@Override
	public Group readGroup(Object id) {
		return em.find(com.netbuilder.tps.entity.Group.class, id);
	}

	@Override
	public Group updateGroup(Group group) {
		return em.merge(group);
	}

	@Override
	public void removeGroup(Group group) {
		em.remove(em.merge(group));
	}

}