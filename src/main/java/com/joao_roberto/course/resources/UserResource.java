package com.joao_roberto.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joao_roberto.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
	User u = new User(1L,"Maria","naria@gmail.com","19971137583","123456");
	return ResponseEntity.ok().body(u);
	
	}
	
}
