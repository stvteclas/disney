package com.teclas.disney.web;

import com.teclas.disney.domain.Genre;
import com.teclas.disney.service.GenreService;
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
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping("/")
    public String inicio(Model model){
        var generos = genreService.listarGeneros();
        model.addAttribute("generos", generos);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Genre genre){
        return "modificar";
    }
    @PostMapping("/guardar")
    public String guardar(@Valid Genre genre, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        genreService.guardar(genre);
        return "redirect:/";
    }

    @GetMapping("/editar/{idGenero}")
    public String editar(Genre genre, Model model){
        genre = genreService.encontrarGenero(genre);
        model.addAttribute("genre", genre);
        return "modificar";
    }
    @GetMapping("/eliminar/{idGenero}")
    public String eliminar(Genre genre){
        genreService.eliminar(genre);
        return "redirect:/";
    }
}
