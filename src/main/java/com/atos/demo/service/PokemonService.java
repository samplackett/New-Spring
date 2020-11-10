package com.atos.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atos.demo.persistence.domain.Pokemon;
import com.atos.demo.persistence.repo.PokemonRepo;

@Service
public class PokemonService {

	// CRUD - Create Read Update Delete
	private PokemonRepo repo;
	
	public PokemonService(PokemonRepo repo) {
		super();
		this.repo = repo;
	}
	
	public Pokemon createPokemon(Pokemon pokemon) {
		return this.repo.save(pokemon);
	}
	
	public Pokemon getPokemonByID(Long id) {
		return this.repo.findById(id).get();
	}
	
	public List<Pokemon> getPokemon() {
		return this.repo.findAll();
	}
	
	public Pokemon updatePokemon(Long id, Pokemon newData) {
		Pokemon existing = this.repo.findById(id).get();
		existing.setCoolShiny(newData.isCoolShiny());
		existing.setDexNo(newData.getDexNo());
		existing.setName(newData.getName());
		existing.setNativeRegion(newData.getNativeRegion());
	
		return this.repo.save(existing);
	}
	
	public boolean deletePokemonByID(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id); // if false still exists, otherwise true
	}
}
