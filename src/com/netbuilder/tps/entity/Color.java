package com.netbuilder.tps.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Colors")
public class Color implements Serializable {

	private static final long serialVersionUID = 1L;

	public Color() {
		
	}
	
	@Id
	@GeneratedValue
	private String colorID;
	
	private String colorValue;
	
	public String getColorID() {
		return colorID;
	}

	public void setColorID(String colorID) {
		this.colorID = colorID;
	}

	public String getColorValue() {
		return colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

}
