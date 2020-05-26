package knyrik.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements MusicLib {
    private List<String> songs = new ArrayList<>();
    Random random = new Random();

    {
        songs.add("Wind cries Mary"); // 0
        songs.add("The roof is on Fire"); // 1
        songs.add("Hunger Of The Pine"); // 2

    }

    @Override
    public List<String> getSong() {
        return songs;
    }


    public String getRandomSong() {
        return songs.get(random.nextInt(songs.size()));
    }
}
