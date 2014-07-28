package com.netbuilder.tps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Groups")
public class Group implements java.io.Serializable {
	
private static final long serialVersionUID = 1L;
	
	public Group() {
		
	}
	
	private String groupID;
	private String statusID;
	private String name;
	private String startDate;
	private String endDate;
	private String customer;
	private String customerLocation;
	
	@Id
	@GeneratedValue
	public String getGroupID() {
		return groupID;
	}
	
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	
	public String getStatusID() {
		return statusID;
	}
	
	public void setStatusID(String statusID) {
		this.statusID = statusID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public String getCustomer() {
		return customer;
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public String getCustomerLocation() {
		return customerLocation;
	}
	
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	
}
