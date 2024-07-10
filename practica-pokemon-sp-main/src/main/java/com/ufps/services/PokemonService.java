package com.ufps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entities.Pokemon;
import com.ufps.repositories.PokemonRepository;


@Service
public class PokemonService {
	
	@Autowired
	PokemonRepository pokemonRepository;
	
	public List<Pokemon> getPokemonsByTipo(String tipoUuid) {
        return pokemonRepository.findByTipoPokemonUuid(tipoUuid);
    }
	
	public Pokemon registerPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }
	

}
