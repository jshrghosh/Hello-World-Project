package com.nt.service;

import com.nt.entity.UserEntity;

public interface IUserService {
	public UserEntity saveUser(String firstName,String lastName);
	public boolean deleteUserById(Integer id);
}
