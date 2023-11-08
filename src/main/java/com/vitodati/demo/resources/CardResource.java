package com.vitodati.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitodati.demo.entities.Card;

@RestController
@RequestMapping(value = "/Card")
public class CardResource {

	@GetMapping
	public ResponseEntity<Card> findAll(){
		
		
		Card u = new Card(1L, "ayara" , 1, 2);
		return ResponseEntity.ok().body(u);
	
		
	}
}
