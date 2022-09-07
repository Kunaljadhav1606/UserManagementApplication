package com.BikkadIT.UserManagementApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.UserManagementApplication.Binding.LoginForm;
import com.BikkadIT.UserManagementApplication.Repository.UserAccountRepository;
import com.BikkadIT.UserManagementApplication.entites.UserAccountEntity;

@Service
public class UserServiceImpl implements UserServiceI {
	
	@Autowired
	private UserAccountRepository userAccountRepository;

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
	
	
	

}
