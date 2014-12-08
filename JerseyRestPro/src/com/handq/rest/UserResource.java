package com.handq.rest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handq.entity.User;
import com.handq.rest.impl.ResourceUser;
import com.handq.sevice.IUserSevice;

@Component
@Path("/users")
public class UserResource {
	private static Logger logger =  LoggerFactory.getLogger(UserResource.class);
	@Context
	private UriInfo uriInfo;
	/**
	 * 获取用户
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<User> getUsers(){
		List<User> users = new ArrayList<User>();
		users = ResourceUser.getUsers();
		return users;
	}
	
	/**
	 * 根据用户id获取用户
	 */
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public User getUserById(@PathParam("id") String id){
		User user = ResourceUser.getUserById(id);
		return user;
	}

	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	@DELETE
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})  
	public boolean deleteUserById(@PathParam("id") String id){
		return ResourceUser.deleteUserById(id);
	}
	
	/**
	 * 新增用户
	 */
	@POST
	@Path("/addUser")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public User AddUser(User request){
		System.out.println("------------------------------");
		User user = new User();
		user.setName(request.getName());
		user.setAge(request.getAge());
		user.setId("2222"); 
		user = ResourceUser.addUser(user);
		return user;
	}
	
}
