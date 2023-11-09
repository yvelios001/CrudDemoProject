package com.vitodati.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitodati.demo.entities.Card;
import com.vitodati.demo.repositories.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository repository;
		
	public List<Card> findAll(){
		return repository.findAll();
	}
 	
	public Card findById(Long id) {
		Optional<Card> obj = repository.findById(id);
		return obj.get();
	}
}

