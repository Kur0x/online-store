package com.digital.dao;

import com.digital.entity.User;

public interface UserDAO {
	
	//添加一个用户
	public int addUser(User user);
	
	//查询一个用户
	public int queryUser(String userName,String password);
	
}
