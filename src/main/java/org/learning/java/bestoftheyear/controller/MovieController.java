package org.learning.java.bestoftheyear.controller;

import org.learning.java.bestoftheyear.model.Movie;
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
    @GetMapping
    public String movieIndex(Model model){
        List<Movie> movies = getMovies();
        model.addAttribute("myMovies", movies);
        return "movieIndex";
    }

    @GetMapping("{id}")
    public String movieId(@PathVariable int id, Model model){
        List<Movie> movies = getMovies();
        for(Movie m: movies){
            if (m.getId() == id) {
                model.addAttribute("singleMovie", m);
            }
        }
        return "movieDetails";
    }

    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("film1",1));
        movies.add(new Movie("film2",2));
        movies.add(new Movie("film3",3));
        return movies;
    }
}
