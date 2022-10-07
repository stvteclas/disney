package com.teclas.disney.dao;

import com.teclas.disney.domain.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends CrudRepository<Character, Long> {
}
