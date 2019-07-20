package com.DBS.Hack2Win.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DBS.Hack2Win.dao.UserRepo;
import com.DBS.Hack2Win.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/adduser")
	public void home(User user ) {
		repo.save(user);
	}

}
