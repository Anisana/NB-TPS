package com.netbuilder.tps.services;

import javax.ejb.Local;

import com.netbuilder.tps.entity.Trainer;

@Local
public interface TrainerService {

	Trainer createTrainee(Trainer trainee);
	Trainer readTrainee(Object id);
	Trainer updateTrainee(Trainer trainee);
	void removeTrainee(Trainer trainee);
}
