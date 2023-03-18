package com.udacity.mvc.service;

import org.springframework.data.repository.CrudRepository;

import com.udacity.mvc.model.User;

public interface UserRepo extends CrudRepository <User, Long> {
    
}
