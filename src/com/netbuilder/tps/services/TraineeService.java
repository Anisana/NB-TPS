package com.netbuilder.tps.services;

import javax.ejb.Local;

import com.netbuilder.tps.entity.Trainee;

@Local
public interface TraineeService {
	
	Trainee createTrainee(Trainee trainee);
	Trainee readTrainee(Object id);
	Trainee updateTrainee(Trainee trainee);
	void removeTrainee(Trainee trainee);
	
}