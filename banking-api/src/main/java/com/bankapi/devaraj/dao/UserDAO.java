package com.bankapi.devaraj.dao;

import java.util.List;

import com.bankapi.devaraj.model.User;

public interface UserDAO {
	
	public boolean createUser(User user);
	public List<User> listAllUser();
	public boolean removeUser(int user_id);
	public int getUserId(String user);
}
