package com.teclas.disney.domain;


import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "character")
public class Character implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonaje;
    @NotEmpty
    private String imagen;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String edad;

    private String peso;
    @NotEmpty
    private String historia;
    @NotEmpty
    private String peliculasAsociadas;

}
