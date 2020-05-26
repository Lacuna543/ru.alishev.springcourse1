package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;


public class MusicPlayer {
    //   private MusicLib[] lib;
    List<MusicLib> lib;
    @Value("${musicPlayer.name}")
    private String name;


    public String getName() {
        return name;
    }

    @Value("${musicPlayer.volume}")
    private int volume;

    public int getVolume() {
        return volume;
    }


    public MusicPlayer(List<MusicLib> lib) {
        //  this.lib = new MusicLib[5];
        this.lib = lib;
        //lib.add(GenreOfMusic.ROCK);
        //  this.lib[GenreOfMusic.CLASSICAL.ordinal()] = classical;
        //  this.lib[GenreOfMusic.ROCK.ordinal()] = rock;
    }

    public String playMusic(GenreOfMusic genre) {
       return lib.get(genre.ordinal()).getRandomSong() + " with volume " + this.volume;
        // return "Playing: " + songs.get(randInt(0, songs.size() - 1));



    }


    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;


    }
}
