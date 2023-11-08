package com.vitodati.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitodati.demo.entities.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	

}
