package org.learning.java.bestoftheyear.controller;

import org.learning.java.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("movie/")
public class MovieController {
    @GetMapping("{id}")
    public String movieId(@PathVariable(name = "id") int movieId, Model model){
        for (int i = 0; i < getMovies().size()-1; i++) {
            if (i == movieId){
                model.addAttribute("singleMovie", getMovies().get(i));
            }
        }
        return "movieDetails";
    }

    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("film1"));
        movies.add(new Movie("film2"));
        movies.add(new Movie("film3"));
        return movies;
    }
}
