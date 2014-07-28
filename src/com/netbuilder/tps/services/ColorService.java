package com.netbuilder.tps.services;

import javax.ejb.Local;

import com.netbuilder.tps.entity.Color;

@Local
public interface ColorService {

	Color createColor(Color color);
	Color readColor(Object id);
	Color updateColor(Color color);
	void removeColor(Color color);
}
