package com.ufps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

	List<Pokemon> findByTipoPokemonUuid(String uuid);

}
