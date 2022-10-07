package com.teclas.disney.service;


import com.teclas.disney.dao.CharacterDao;
import com.teclas.disney.domain.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class CharacterServiceImpl implements CharacterService{

@Autowired
    private CharacterDao characterDao;

    @Override
    @Transactional(readOnly = true)
    public List<Character> listarCharacter(){
        return (List<Character>) characterDao.findAll();
    }
    @Override
    @Transactional
    public void guardar(Character character){
        characterDao.save(character);
    }

    @Override
    @Transactional
    public void eliminar(Character character){
        characterDao.delete(character);
    }

    @Override
    @Transactional(readOnly = true)
    public Character encontrarCharacter(Character character){
        return characterDao.findById(character.getIdPersonaje()).orElse(null);
    }
}
