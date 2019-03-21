package com.cognizant.model;

import org.hibernate.validator.constraints.Range;

public class Goal {
	
	@Range(min=1,max=60)
	private String minutes;

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}
	
}
