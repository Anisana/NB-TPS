package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Topic;
import com.netbuilder.tps.services.TopicService;

@Stateless
public class TopicServiceBean implements TopicService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Topic createTopic(Topic topic) {
		return em.merge(topic);
	}

	@Override
	public Topic readTrainee(Object id) {
		return em.find(com.netbuilder.tps.entity.Topic.class, id);
	}

	@Override
	public Topic updateTrainee(Topic topic) {
		return em.merge(topic);
	}

	@Override
	public void removeTrainee(Topic topic) {
		em.remove(em.merge(topic));
	}

}

//
//return em.merge(group);
//return em.find(com.netbuilder.tps.entity.Group.class, id);
//return em.merge(group);
//em.remove(em.merge(group));