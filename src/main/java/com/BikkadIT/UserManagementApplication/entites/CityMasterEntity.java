package com.BikkadIT.UserManagementApplication.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CITY_MASTER")
@Data
public class CityMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CITY_ID")
	private Integer cityId;
	@Column(name="CITY_NAME")
	private String cityName;
	@Column(name="STATE_ID")
	private Integer stateId;
	
}
