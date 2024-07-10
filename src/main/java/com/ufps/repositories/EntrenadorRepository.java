package com.ufps.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.entities.Entrenador;


public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {
	
	Optional<Entrenador> findByEmail(String email);

}
