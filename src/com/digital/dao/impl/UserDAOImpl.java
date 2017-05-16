package com.digital.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.digital.dao.BaseDAO;
import com.digital.dao.UserDAO;
import com.digital.entity.User;
import com.opensymphony.xwork2.ActionContext;

public class UserDAOImpl extends BaseDAO implements UserDAO {
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	
	@Override
	public int addUser(User user) {
		int result=0;
		String sql="insert into user_info(userName,password) values(?,?)";
		try {
			conn=this.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(conn, pstmt, rs);
		}		
		return result;
	}
	
	@Override
	public int queryUser(String userName,String password) {
		int result=0;
		String sql="select * from user_info where userName='"+userName+"' and password='"+password+"'";
		try {
			conn=this.getConnection();
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			if (rs.next()) {
				return 1;
			}else{
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(conn, pstmt, rs);
		}		
		return result;
	}

}
