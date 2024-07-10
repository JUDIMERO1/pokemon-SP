package com.ufps.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.entities.Entrenador;
import com.ufps.services.EntrenadorService;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {

	@Autowired
	EntrenadorService entrenadorService;

	@PostMapping
	public String postTest() {
		return "Post";
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestParam(name = "email", required = true) String email) {

		System.out.println(email);
		Optional<Entrenador> entrenador = entrenadorService.login(email);

		if (entrenador.isPresent()) {
			return new ResponseEntity<>(entrenador.get().getUuid(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * @GetMapping("/{uuid}/pokemons") public ResponseEntity<List<PokemonDTO>>
	 * getPokemons(@PathVariable String uuid) { List<PokemonDTO> pokemons =
	 * entrenadorService.getPokemons(uuid); return ResponseEntity.ok(pokemons); }
	 * 
	 * @PostMapping("/{uuid}/pokemons/{pokemonUuid}") public ResponseEntity<?>
	 * assignPokemon(@PathVariable String uuid, @PathVariable String pokemonUuid) {
	 * List<PokemonDTO> updatedPokemons = entrenadorService.assignPokemon(uuid,
	 * pokemonUuid); return ResponseEntity.ok(updatedPokemons); }
	 */

}
