package com.ufps.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EntrenadorDTO {
	
	private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private LocalDate fechaVinculacion;
    private PuebloDTO pueblo;
    private String uuid;

}
