package com.DBS.Hack2Win.dao;

import org.springframework.data.repository.CrudRepository;

import com.DBS.Hack2Win.model.User;

public interface UserRepo extends CrudRepository<User, String> {

}
