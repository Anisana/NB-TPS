package com.netbuilder.tps.services;

import javax.ejb.Local;

import com.netbuilder.tps.entity.Status;

@Local
public interface StatusService {

	Status createStatus(Status status);
	Status readStatus(Object id);
	Status updateStatus(Status status);
	void removeStatus(Status status);
}
