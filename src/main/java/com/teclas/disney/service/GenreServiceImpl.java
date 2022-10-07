package com.teclas.disney.service;

import com.teclas.disney.dao.GenreDao;
import com.teclas.disney.domain.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService{
    @Autowired
    private GenreDao genreDao;

    @Override
    @Transactional(readOnly = true)
    public List<Genre> listarGeneros(){
        return (List<Genre>) genreDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Genre genre){
        genreDao.save(genre);
    }
    @Override
    @Transactional
    public void eliminar(Genre genre){
        genreDao.delete(genre);
    }
    @Override
    @Transactional(readOnly = true)
    public Genre encontrarGenero(Genre genre){
        return genreDao.findById(genre.getIdGenero()).orElse(null);
    }
}
