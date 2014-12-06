package com.handq.sevice;

import java.util.List;

import com.handq.entity.User;

public interface IUserSevice {
	public User addUser(User user);
	public List<User> getUsers();
	public User getUserById(String id);
}
