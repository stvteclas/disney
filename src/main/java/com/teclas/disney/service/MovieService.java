package com.teclas.disney.service;

import com.teclas.disney.domain.Movie;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler;

import java.util.List;

public interface MovieService {
    public List<Movie> listarMovies();
    public void guardar(Movie movie);
    public void eliminar(Movie movie);
    public Movie encontrarMovie(Movie movie);
}
