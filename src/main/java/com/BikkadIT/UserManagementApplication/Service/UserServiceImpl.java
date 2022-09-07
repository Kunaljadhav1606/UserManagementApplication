package com.BikkadIT.UserManagementApplication.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.UserManagementApplication.Binding.LoginForm;
import com.BikkadIT.UserManagementApplication.Repository.CityRepository;
import com.BikkadIT.UserManagementApplication.Repository.CountryRepository;
import com.BikkadIT.UserManagementApplication.Repository.StateRepository;
import com.BikkadIT.UserManagementApplication.Repository.UserAccountRepository;
import com.BikkadIT.UserManagementApplication.entites.CityMasterEntity;
import com.BikkadIT.UserManagementApplication.entites.CountryMasterEntity;
import com.BikkadIT.UserManagementApplication.entites.StateMasterEntity;
import com.BikkadIT.UserManagementApplication.entites.UserAccountEntity;

@Service
public class UserServiceImpl implements UserServiceI {
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	

	@Override
	public String loginCheck(LoginForm loginForm) {
		UserAccountEntity userAccountEntity = userAccountRepository.findByEmailAndPassword(loginForm.getEmail(), loginForm.getPassword());
		if(userAccountEntity != null) {
			String accStatus = userAccountEntity.getAccStatus();
			if(accStatus.equals("LOCKED")) {
				return "Your Acoount is locked";		
				}else {
			return " Login successful welcome to Bikkad IT";
		}
			
		}else {
			
			return "Creditional Are invalid";
		}
	}

	@Override
	public Map<Integer, String> getCountries() {
		List<CountryMasterEntity> findAll = countryRepository.findAll();
		Map<Integer ,String> countryMap=new HashMap<Integer , String>();
		for(CountryMasterEntity u:findAll) {
		    countryMap.put(u.getCountryId(), u.getCountryName());
		}
		return countryMap;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
	List<StateMasterEntity> finByCountryId = stateRepository.finByCountryId(countryId);
	Map<Integer , String> stateMap=new HashMap<Integer , String>();
	for(StateMasterEntity u : finByCountryId) {
		stateMap.put(u.getStateId(), u.getStateName());
	}
		
		return stateMap;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		List<CityMasterEntity> findByStateId = cityRepository.findByStateId(stateId);
		Map<Integer , String> cityMap=new HashMap<Integer , String >();
		for(CityMasterEntity u : findByStateId) {
			cityMap.put(u.getCityId(), u.getCityName());
		}
		return cityMap;
	}
	
	
	

}
