package com.netbuilder.tps.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Modules")
public class Module implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Module() {
	}
	
	@Id
	@GeneratedValue
	private String moduleID;
	private String groupID;
	private String topicID;
	private String startDate;
	private String endDate;
	
	public String getModuleID() {
		return moduleID;
	}
	
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
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
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
