package com.netbuilder.tps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Topics")
public class Topic implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Topic() {
		
	}
	
	private String topicID;
	private String colourID;
	private String technology;
	private String technologyVersion;
	private String topicDescription;
	
	@Id
	@GeneratedValue
	public String getTopicID() {
		return topicID;
	}
	
	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}
	
	public String getColourID() {
		return colourID;
	}
	
	public void setColourID(String colourID) {
		this.colourID = colourID;
	}
	
	public String getTechnology() {
		return technology;
	}
	
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public String getTechnologyVersion() {
		return technologyVersion;
	}
	
	public void setTechnologyVersion(String technologyVersion) {
		this.technologyVersion = technologyVersion;
	}
	
	public String getTopicDescription() {
		return topicDescription;
	}
	
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

}
