package com.teclas.disney.web;

import com.teclas.disney.domain.Character;
import com.teclas.disney.service.CharacterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/")
    public String inicio(Model model){
        var characters = characterService.listarCharacter();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("characters" , characters);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Character character){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Character character, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        characterService.guardar(character);
        return "redirect:/";
    }

    @GetMapping("/editar/{idCharacter}")
    public String editar(Character character, Model model){
        character = characterService.encontrarCharacter(character);
        model.addAttribute("character", character);
        return "modificar";
    }
    @GetMapping("/eliminar/{idCharacter}")
    public String eliminar(Character character){
        characterService.eliminar(character);
        return "redirect:/";
    }


}
