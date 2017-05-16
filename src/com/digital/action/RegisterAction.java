package com.digital.action;

import com.digital.dao.UserDAO;
import com.digital.dao.impl.UserDAOImpl;
import com.digital.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private User user;
	private String repassword;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	
	
	public String register() throws Exception {
		
		
		
		UserDAO ud=new UserDAOImpl();
		
		int result=ud.addUser(user);
		String page;
		if (result!=0) {
			page="success";
		}else{
			page="error";
		}
		return page;
	}	
	
	
	

	
	
}
