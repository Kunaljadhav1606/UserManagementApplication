package com.BikkadIT.UserManagementApplication.Service;

import java.util.Map;

import com.BikkadIT.UserManagementApplication.Binding.LoginForm;

public interface UserServiceI {

	public String loginCheck(LoginForm loginForm);
	
	public Map<Integer , String> getCountries();
	
	public Map<Integer , String>  getStates(Integer countryId);
	
	public Map<Integer , String> getCities(Integer stateId);
}
