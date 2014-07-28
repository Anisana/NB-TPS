package com.netbuilder.tps.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Status")
public class Status implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int statusID;

	private String value;
	
	public Status() {

	}

	public Status( String value) {
		
		this.value = value;

	}

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
