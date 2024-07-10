package com.ufps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.entities.Pokemon;
import com.ufps.services.PokemonService;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
	
	@Autowired
    private PokemonService pokemonService;
	
	@GetMapping("/{tipo}")
    public ResponseEntity<List<Pokemon>> getPokemonsByType(@PathVariable String tipo) {
        List<Pokemon> pokemons = pokemonService.getPokemonsByTipo(tipo);
        return ResponseEntity.ok(pokemons);
    }

	@PostMapping
	public ResponseEntity<Pokemon> registerPokemon(@RequestBody Pokemon pokemon) {
	    Pokemon savedPokemon = pokemonService.registerPokemon(pokemon);
	    return ResponseEntity.ok(savedPokemon);
	}
    
}
