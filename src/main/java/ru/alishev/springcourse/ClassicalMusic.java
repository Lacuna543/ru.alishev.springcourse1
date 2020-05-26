package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements MusicLib {

    Random random = new Random();
    private List<String> songs = new ArrayList<>();

    {
        /* public int index = rand.nextInt(songs.size());*/
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony No. 6");
        songs.add("Requiem");

    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }

    @Override
    public String getRandomSong() {
        return songs.get(random.nextInt(songs.size()));
    }
}
            
