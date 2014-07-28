package com.netbuilder.tps.services;

import com.netbuilder.tps.entity.Support;

public interface SupportService {

	Support createSupport(Support support);
	Support readSupport(Object id);
	Support updateSupport(Support support);
	void removeSupport(Support support);
}
