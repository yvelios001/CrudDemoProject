package com.vitodati.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vitodati.demo.entities.Card;
import com.vitodati.demo.repositories.CardRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private CardRepository cardRepository;

	@Override
	public void run(String... args) throws Exception {
		Card u1 = new Card(null,"Ayara",1,3);
		Card u2 = new Card(null,"Dark Ritual",1,3);
		
		cardRepository.saveAll(Arrays.asList(u1,u2));
		
		
		
	}

}
