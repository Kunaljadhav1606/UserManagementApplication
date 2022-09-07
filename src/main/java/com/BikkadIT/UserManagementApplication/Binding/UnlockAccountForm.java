package com.BikkadIT.UserManagementApplication.Binding;

import lombok.Data;

@Data
public class UnlockAccountForm {

	private String emailId;
	
	private String tempPwd;
	
	private String newPwd;
	
	private String confirmPwd;
	
}
