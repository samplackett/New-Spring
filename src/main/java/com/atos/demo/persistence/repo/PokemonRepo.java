package com.atos.demo.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.demo.persistence.domain.Pokemon;

@Repository
public interface PokemonRepo extends JpaRepository<Pokemon, Long> {

	// 
	
}
