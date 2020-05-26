package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;


public class MusicPlayer {
    //   private MusicLib[] lib;
    ArrayList<MusicLib> lib = new ArrayList<>();
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


    public MusicPlayer(ArrayList<MusicLib> lib) {
        //  this.lib = new MusicLib[5];
       this.lib= lib;
        //lib.add(GenreOfMusic.ROCK);
        //  this.lib[GenreOfMusic.CLASSICAL.ordinal()] = classical;
        //  this.lib[GenreOfMusic.ROCK.ordinal()] = rock;
    }

    public String playMusic(GenreOfMusic genre) {
        String song = lib.get(genre.ordinal()).getRandomSong();
        // return "Playing: " + songs.get(randInt(0, songs.size() - 1));

        return song;

    }


    public static int randInt(int min, int max) {
        // NOTE: This will (intentionally) not run as written so that folks
        // copy-pasting have to think about how to initialize their
        // Random instance.  Initialization of the Random instance is outside
        // the main scope of the question, but some decent options are to have
        // a field that is initialized once and then re-used as needed or to
        // use ThreadLocalRandom (if using at least Java 1.7).
        //
        // In particular, do NOT do 'Random rand = new Random()' here or you
        // will get not very good / not very random results.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
