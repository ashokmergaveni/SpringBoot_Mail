package com.amwater;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventsObject {

	
	public String name;
	public String alertType;
	public String venue;
	public String description;
	public String employeeId;
	public int eventId;
	public String isApproved;
	public String email;
	public String employeeName;
	
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public EventsObject(){
		
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAlertType() {
	return alertType;
}
public void setAlertType(String alertType) {
	this.alertType = alertType;
}
public String getVenue() {
	return venue;
}
public void setAddLocation(String venue) {
	this.venue = venue;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public int getEventId(){
	return eventId;
}
public void setEventId(int eventId){
	this.eventId = eventId;
}

}
