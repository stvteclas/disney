package com.teclas.disney.web;

import com.teclas.disney.domain.Movie;
import com.teclas.disney.service.MovieService;
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
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String inicio (Model model){
        var movies = movieService.listarMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Movie movie) {
        return  "modificar";
    }
    @PostMapping("/guardar")
    public String guardar(@Valid Movie movie, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        movieService.guardar(movie);
        return "redirect:/";
    }

    @GetMapping("/eliminar/{idMovie}")
    public String eliminar(Movie movie){
        movieService.eliminar(movie);
        return "redirect:/";
    }
}
