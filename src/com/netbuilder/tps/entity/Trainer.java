package com.netbuilder.tps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trainers")
public class Trainer implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Trainer() {
		
	}
	
	private String trainerID;
	private String name;
	private String surname;
	private String email;
	private String phone;
	
	@Id
	@GeneratedValue
	public String getTrainerID() {
		return trainerID;
	}
	
	public void setTrainerID(String trainerID) {
		this.trainerID = trainerID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
