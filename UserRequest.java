package com.nt.dto;

import jakarta.validation.constraints.NotBlank;

public class UserRequest {
	@NotBlank(message="First name is required")
	private String firstName;
	
	@NotBlank(message="Last name is required")
	private String lastName;

	public UserRequest() {}

	public UserRequest(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	}

	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
}
