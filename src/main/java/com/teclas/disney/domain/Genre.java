package com.teclas.disney.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "genre")
public class Genre implements Serializable {
    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String imagen;
    @NotEmpty
    private String peliculasAsociadas;
}
