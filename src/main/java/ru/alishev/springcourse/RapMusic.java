package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RapMusic implements MusicLib {

    private List<String> songs = new ArrayList<>();
    Random random = new Random();

    {

        songs.add("Without me");
        songs.add("Akule plevat'");
        songs.add("2pack");


    }

//    public List<String> getSong(int index) {
//        return songs;
//    }

    @Override
    public List<String> getSong() {
        return songs;
    }


    public String getRandomSong() {
        return songs.get(random.nextInt(songs.size() ));
    }
}