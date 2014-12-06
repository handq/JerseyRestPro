package com.handq.sevice.impl;

import java.util.ArrayList;
import java.util.List;

import com.handq.entity.User;
import com.handq.sevice.IUserSevice;

public class UserSeviceImpl implements IUserSevice {

	public User addUser(User user) {
		System.out.println(user.getId()+"="+user.getName()+"="+user.getAge());
		return user;
	}

	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId("1000");
		user.setName("测试人员");
		user.setAge(10);
		users.add(user);
		return users;
	}

	public User getUserById(String id) {
		User user = new User();
		user.setId("1000");
		user.setName("测试人员");
		user.setAge(10);
		if(id.equals(user.getId())){
			return user;
		}else{
			return null;
		}
	}

}
