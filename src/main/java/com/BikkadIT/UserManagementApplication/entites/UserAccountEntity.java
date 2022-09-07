package com.BikkadIT.UserManagementApplication.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
@Table(name="USER_ACCOUNT")
@Data
public class UserAccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FIRST_NAME")
	private String fName;
	@Column(name="LAST_NAME")
	private String lName;
	@Column(name="USER_EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="USER_PHNO")
	private long phno;
	@Column(name="DOB")
	private LocalDate dob;
	@Column(name="GENDER")
	private String gender;
	@Column(name="CITY_ID")
	private Integer cityId;
	@Column(name="STATE_ID")
	private Integer stateId;
	@Column(name="COUNTRY_ID")
	private Integer countryId;
	@Column(name="ACC_STATUS")
	private String accStatus;
	
	@CreatedDate
	@Column(name="CREATE_DATE")
	private LocalDate createDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE")
	private LocalDate updatedDate;
}
