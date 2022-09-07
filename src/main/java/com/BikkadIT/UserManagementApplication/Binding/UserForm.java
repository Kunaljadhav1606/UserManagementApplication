package com.BikkadIT.UserManagementApplication.Binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserForm {

private String fName;
	
	private String lName;
	
	private String email;
	
	private long phno;
	
	private LocalDate dob;
	
	private String gender;
	
	private Integer cityId;
	
	private Integer stateId;
	
	private Integer countryId;
}
