package com.digital.action;

import java.util.Map;

import com.digital.dao.UserDAO;
import com.digital.dao.impl.UserDAOImpl;
import com.digital.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private User user;	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String login() throws Exception {
		String userName=user.getUserName();
		String password=user.getPassword();
		String page=null;
		
		UserDAO ud=new UserDAOImpl();
		
		int result = ud.queryUser(userName, password);
		
		if(result==1){
			Map<String, Object> session=null;
			ActionContext ac=ActionContext.getContext();
			session=ac.getSession();
			session.put("CURRENT_USER", userName);
			page="success";
		}else{
			setMessage("登录失败，请检查用户名和密码是否正确！");
			page="error";
		}
		
		
		return page;
	}
	
	
	
	
}
