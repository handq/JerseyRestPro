package com.handq.rest.impl;

import java.util.ArrayList;
import java.util.List;

import com.handq.entity.User;

public class ResourceUser {

	public static List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId("1000"); 
		user.setName("测试人员");
		user.setAge(10);
		users.add(user);
		return users;
	}

	public static User getUserById(String id) {
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
	
	public static boolean deleteUserById(String id){
		boolean flag= false;
		if(id.equals("1000")){
			flag=true;
		}
		System.out.println(flag);
		return flag;
	}
	
	public static User addUser(User user) {
		System.out.println(user.getId()+"="+user.getName()+"="+user.getAge());
		return user;
	}
}
