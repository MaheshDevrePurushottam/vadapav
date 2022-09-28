package com.example.demo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		User user=new User();
		//user.setId(101);
		user.setName("Mahesh");
		user.setCity("Hyd");
		user.setStatus("I am Java Programmer");
		
		User user1=userRepository.save(user);
		
		System.out.println(user1);
	}

}
