package com.teclas.disney.service;

import com.teclas.disney.dao.MovieDao;
import com.teclas.disney.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieDao movieDao;
    @Override
    @Transactional(readOnly = true)
    public List<Movie> listarMovies(){
        return (List<Movie>) movieDao.findAll();
    }
    @Override
    @Transactional
    public void guardar (Movie movie){
        movieDao.save(movie);
    }
    @Override
    @Transactional
    public void eliminar(Movie movie){
        movieDao.delete(movie);
    }
    @Override
    @Transactional(readOnly = true)
    public Movie encontrarMovie(Movie movie){
        return movieDao.findById(movie.getIdPelicula()).orElse(null);
    }
}
