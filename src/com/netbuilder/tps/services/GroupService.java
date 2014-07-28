package com.netbuilder.tps.services;

import javax.ejb.Local;

import com.netbuilder.tps.entity.Group;

@Local
public interface GroupService {
	
	Group createGroup(Group group);
	Group readGroup(Object id);
	Group updateGroup(Group group);
	void removeGroup(Group group);
	
}
