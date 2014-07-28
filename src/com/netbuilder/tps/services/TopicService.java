package com.netbuilder.tps.services;

import javax.ejb.Local;

import com.netbuilder.tps.entity.Topic;

@Local
public interface TopicService {

	Topic createTopic(Topic topic);
	Topic readTrainee(Object id);
	Topic updateTrainee(Topic topic);
	void removeTrainee(Topic topic);
}
