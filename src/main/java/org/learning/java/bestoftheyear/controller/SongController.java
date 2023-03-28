package org.learning.java.bestoftheyear.controller;

import org.learning.java.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("song/")
public class SongController {

    @GetMapping
    public String songIndex(Model model) {
        List<Song> songs = getSongs();
        model.addAttribute("mySongs", songs);
        return "songIndex";
    }

    @GetMapping("{id}")
    public String songId(@PathVariable int id, Model model) {
        List<Song> songs = getSongs();
        for (Song s : songs) {
            if (s.getId() == id) {
                model.addAttribute("singleSong", s);
            }
        }
        return "songDetails";
    }

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("song1", 1, 5, "testo canzone"));
        songs.add(new Song("song2", 2, 5, "testo canzone"));
        songs.add(new Song("song3", 3, 5, "testo canzone"));
        return songs;
    }
}
