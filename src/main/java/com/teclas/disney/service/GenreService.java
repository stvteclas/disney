package com.teclas.disney.service;

import com.teclas.disney.domain.Genre;

import java.util.List;

public interface GenreService {
    public List<Genre> listarGeneros();
    public void guardar(Genre genre);
    public void eliminar(Genre genre);
    public Genre encontrarGenero(Genre genre);
}
