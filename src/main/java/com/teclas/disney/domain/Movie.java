package com.teclas.disney.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "movie")
public class Movie implements Serializable {
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula;
    @NotEmpty
    private String imagen;
    @NotEmpty
    private String titulo;
    @NotEmpty
    private String fechaCreacion;
    @NotEmpty
    private String calificacion;
    @NotEmpty
    private String personajesAsociados;
}
