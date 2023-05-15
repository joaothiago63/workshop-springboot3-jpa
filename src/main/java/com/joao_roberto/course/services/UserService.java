package com.joao_roberto.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao_roberto.course.entities.User;
import com.joao_roberto.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		List<User>list = userRepository.findAll();
		return list;
	}
	
	public User findById(Long id) {
	  Optional<User>obj = userRepository.findById(id);
	  
	  return obj.get();
		
     }
	
	public User insert(User obj) {
	return userRepository.save(obj);	
	}
	
}
