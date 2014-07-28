package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Trainer;
import com.netbuilder.tps.services.TrainerService;

@Stateless
public class TrainerServiceBean implements TrainerService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Trainer createTrainee(Trainer trainee) {
		return em.merge(trainee);
	}

	@Override
	public Trainer readTrainee(Object id) {
		return em.find(com.netbuilder.tps.entity.Trainer.class, id);
	}

	@Override
	public Trainer updateTrainee(Trainer trainee) {
		return em.merge(trainee);
	}

	@Override
	public void removeTrainee(Trainer trainee) {
		// TODO Auto-generated method stub

	}

}

//
//return em.merge(group);
//return em.find(com.netbuilder.tps.entity.Group.class, id);
//return em.merge(group);
//em.remove(em.merge(group));
