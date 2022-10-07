package com.teclas.disney.service;

import com.teclas.disney.domain.Character;

import java.util.List;

public interface CharacterService {
    public List<Character> listarCharacter();
    public void guardar(Character character);
    public void eliminar(Character character);
    public Character encontrarCharacter(Character character);
}
