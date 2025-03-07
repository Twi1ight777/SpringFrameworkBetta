package ru.start.springframework.beanlifestyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<Music>();
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) { // Будет искать бины реализующие Music Interface.  Inversion of control
        this.music1 = music1;
        this.music2 = music2;
    } // Внедряем зависимость при помощи конструктора

//    public String playMusic() {
//        return "Играет музыка: " + music.getSong();
//        System.out.println("Играет музыка: " + classicalMusic.getSong());
//        System.out.println("Играет музыка: " + rockMusic.getSong());
//    }
public void playMusic() {
    System.out.println("Играет музыка: " + music1.getSong());
    System.out.println("Играет музыка: " + music2.getSong());
}
//    public void goMyInit() {
//        System.out.println("MusicPlayer bean initialized");
//    }
//    public void goMyDestroy() {
//        System.out.println("MusicPlayer bean destroyed");
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getVolume() {
//        return volume;
//    }


//    public MusicPlayer() {} // Пустой конструктор для бина
//    public void setMusic(Music music) {
//        this.music = music;
//    } // Внедряем зависимость при помощи сеттера

//    public void setMusicList (List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Играет музыка: " + music.getSong());
//        }
//    }
}
