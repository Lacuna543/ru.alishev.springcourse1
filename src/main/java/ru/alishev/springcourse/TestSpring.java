package ru.alishev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        //  System.out.println(classicalMusic.getSong());

         /* Music music = context.getBean("rockMusic", Music.class);
          Music music2 = context.getBean("classicalMusic", Music.class);

          MusicPlayer musicPlayer = new MusicPlayer(music);
          MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

          musicPlayer.playMusicList();
          classicalMusicPlayer.playMusicList();*/
      /*  MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        firstMusicPlayer.setVolume(10);
*/


//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        int SelectGenre = MusicPlayer.randInt(0, 1);
        switch (SelectGenre) {
            case 0: {
                System.out.println("Playing classical: " + musicPlayer.playMusic(GenreOfMusic.CLASSICAL));
                break;
            }
            case 1: {
                System.out.println("Playing rock: " + musicPlayer.playMusic(GenreOfMusic.ROCK));
                break;
            }
            default: {
                break;
            }
        }

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();

    }
}
