package com.netbuilder.tps.services;

import javax.ejb.Local;

import com.netbuilder.tps.entity.Module;

@Local
public interface ModuleService {
	
	Module createModule(Module module);
	Module readModule(Object id);
	Module updateModule(Module module);
	void removeModule(Module module);
}
