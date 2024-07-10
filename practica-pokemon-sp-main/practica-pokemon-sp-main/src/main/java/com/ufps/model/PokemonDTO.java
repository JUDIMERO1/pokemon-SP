package com.ufps.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PokemonDTO {
	
    private Integer id;
    private String nombre;
    private String descripcion;
    private TipoPokemonDTO tipoPokemon;
    private LocalDate fechaDescubrimiento;
    private Integer generacion;
    private String uuid;

}
