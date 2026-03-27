package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.UserEntity;
import com.nt.repo.IUserRepo;

@Service
public class UserService implements IUserService{
	@Autowired
	private IUserRepo userRepo;

	@Override
	public UserEntity saveUser(String firstName,String lastName) {
		UserEntity user=new UserEntity();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		return userRepo.save(user);
	}
	
	@Override
	public boolean deleteUserById(Integer id) {
		if(userRepo.existsById(id)) {
			userRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
