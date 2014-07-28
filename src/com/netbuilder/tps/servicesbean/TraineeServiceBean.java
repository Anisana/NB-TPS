package com.netbuilder.tps.servicesbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.netbuilder.tps.entity.Trainee;
import com.netbuilder.tps.services.TraineeService;

@Stateless
public class TraineeServiceBean implements TraineeService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Trainee createTrainee(Trainee trainee) {
		return em.merge(trainee);
	}

	@Override
	public Trainee readTrainee(Object id) {
		return em.find(com.netbuilder.tps.entity.Trainee.class, id);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		return em.merge(trainee);
	}

	@Override
	public void removeTrainee(Trainee trainee) {
		em.remove(em.merge(trainee));
	}

}

