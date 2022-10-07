package com.teclas.disney.dao;

import com.teclas.disney.domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<Movie, Long> {
}
