package com.BikkadIT.UserManagementApplication.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserManagementApplication.entites.CityMasterEntity;

@Repository
public interface CityRepository extends JpaRepository<CityMasterEntity, Serializable> {

}
