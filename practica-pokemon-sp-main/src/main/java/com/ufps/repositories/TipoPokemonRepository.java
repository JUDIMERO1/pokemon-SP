package com.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.entities.TipoPokemon;

public interface TipoPokemonRepository extends JpaRepository<TipoPokemon, Integer> {

}
