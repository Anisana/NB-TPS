package com.netbuilder.tps.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Avalability")
public class Avalability implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Avalability() {
	
	}
	
	@Id
	@GeneratedValue
	private String availabilityID;
	private String trainerID;
	private String dayOff;

	public String getAvailabilityID() {
		return availabilityID;
	}
	
	public void setAvailabilityID(String availabilityID) {
		this.availabilityID = availabilityID;
	}
	
	public String getTrainerID() {
		return trainerID;
	}
	
	public void setTrainerID(String trainerID) {
		this.trainerID = trainerID;
	}
	
	public String getDayOff() {
		return dayOff;
	}
	
	public void setDayOff(String dayOff) {
		this.dayOff = dayOff;
	}
	
}
