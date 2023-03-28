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

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("myName", "Fabrizio Misseri");

        return "home";
    }


}
