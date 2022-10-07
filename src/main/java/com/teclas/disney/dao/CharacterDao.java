package com.teclas.disney.dao;

import com.teclas.disney.domain.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterDao extends CrudRepository<Character, Long> {
}
