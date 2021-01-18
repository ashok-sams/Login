package com.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
import com.repository.UserRepository;


@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
    private UserRepository userrepository;

	
	@Override
	public void save(User user) {
		userrepository.save(user);
		
	}

	@Override
	public User findByName(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> login(User user) {
		// TODO Auto-generated method stub
		
		String email=user.getEmail();
		String password=user.getPassword();
		List<User> s1=userrepository.findAll(email,password);
		return s1;
	}

}
