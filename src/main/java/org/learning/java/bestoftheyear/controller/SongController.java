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
    @GetMapping("{id}")
    public String songId(@PathVariable(name = "id") int songId, Model model){
        for (int i = 0; i < getSongs().size()-1; i++) {
            if (i == songId){
                model.addAttribute("singleSong", getSongs().get(i));
            }
        }
        return "songDetails";
    }

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("song1"));
        songs.add(new Song("song2"));
        songs.add(new Song("song3"));
        return songs;
    }
}
