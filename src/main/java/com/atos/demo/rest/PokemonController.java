package com.atos.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atos.demo.persistence.domain.Pokemon;
import com.atos.demo.service.PokemonService;

@RestController
public class PokemonController {
	
	private PokemonService service;
	
	public PokemonController(PokemonService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/catchem")
	public String test() {
		return "Gotta Catch 'Em All!";
	}
	
	@PostMapping("/create")
	public Pokemon createPokemon(Pokemon pokemon) {
		return this.service.createPokemon(pokemon);
	}
	
	@GetMapping("/read")
	public List<Pokemon> readAllPokemon() {
		return this.service.getPokemon();
	}
	
	@GetMapping("/read/{id}")
	public Pokemon readPokemon(Long id) {
		return this.service.getPokemonByID(id);
	}
	
	@PutMapping("/update/{id}")
	public Pokemon updatePokemon(@PathVariable Long id, @RequestBody Pokemon newData) {
		return this.service.updatePokemon(id, newData);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deletePokemon(Long id) {
		return this.service.deletePokemonByID(id);
	}

}
