package com.educandoewb.course.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoewb.course.entities.Order;
import com.educandoewb.course.entities.User;
import com.educandoewb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {

	
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", List.of(new Order()));
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", List.of(new Order()));
		
		
		repository.saveAll(Arrays.asList(u1, u2));


	}

}
