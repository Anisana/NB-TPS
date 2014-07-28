package com.netbuilder.tps.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supports")
public class Support implements Serializable {

	private static final long serialVersionUID = 1L;

	public Support() {
	
	}
	
	@Id
	@GeneratedValue
	private String supportID;
	private String moduleId;
	private String groupID;
	private String topicID;
	private String trainerID;
	

	public String getSupportID() {
		return supportID;
	}
	
	public void setSupportID(String supportID) {
		this.supportID = supportID;
	}
	
	public String getModuleId() {
		return moduleId;
	}
	
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	
	public String getGroupID() {
		return groupID;
	}
	
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	
	public String getTopicID() {
		return topicID;
	}
	
	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}
	
	public String getTrainerID() {
		return trainerID;
	}
	
	public void setTrainerID(String trainerID) {
		this.trainerID = trainerID;
	}
		
}
