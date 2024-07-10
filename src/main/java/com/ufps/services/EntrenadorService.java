package com.ufps.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entities.Entrenador;
import com.ufps.repositories.EntrenadorRepository;
//import com.ufps.repositories.PokemonRepository;

@Service
public class EntrenadorService {
	
	@Autowired
    private EntrenadorRepository entrenadorRepository;

	/*
    @Autowired
    private PokemonRepository pokemonRepository;*/
	
	public Optional<Entrenador> login(String email) {
        return entrenadorRepository.findByEmail(email);
    }
    
}
