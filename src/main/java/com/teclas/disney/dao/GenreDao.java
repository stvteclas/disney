package com.teclas.disney.dao;

import com.teclas.disney.domain.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreDao extends CrudRepository<Genre, Long> {
}
