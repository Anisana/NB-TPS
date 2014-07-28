package com.netbuilder.tps.services;

import javax.ejb.Stateless;

import com.netbuilder.tps.entity.Avalability;

@Stateless
public interface AvailabilityService {

	Avalability createAvalability (Avalability avalability);
	Avalability readAvalability (Object id);
	Avalability updateAvalability (Avalability avalability);
	void removeAvalability (Avalability avalability);
}
