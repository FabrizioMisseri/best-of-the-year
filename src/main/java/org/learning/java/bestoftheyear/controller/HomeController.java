package org.learning.java.bestoftheyear.controller;

import org.learning.java.bestoftheyear.model.Movie;
import org.learning.java.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String helloWorldTest() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("myName", "Fabrizio Misseri");

        List<Song> songs = getSongs();
        String string = "";
        for (Song element: songs){
            string += element.getTitle() + " ";
        }
        model.addAttribute("mySongs", string);

        List<Movie> movies = getMovies();
        String string2 = "";
        for (Movie element: movies){
            string2 += element.getTitle() + " ";
        }
        model.addAttribute("myMovies", string2);

        return "home";
    }



    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("film1"));
        movies.add(new Movie("film2"));
        movies.add(new Movie("film3"));
        return movies;
    }



    // METHODS
    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("canzone1"));
        songs.add(new Song("canzone2"));
        songs.add(new Song("canzone3"));
        return songs;
    }



}
