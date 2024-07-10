package com.ufps.entities;

import java.time.LocalDate;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "tipo_pokemon_id")
    private TipoPokemon tipoPokemon;
    private LocalDate fechaDescubrimiento;
    private Integer generacion;
    private String uuid;
    
    @ManyToMany(mappedBy = "pokemons")
    private Set<Entrenador> entrenadores;
    
}
