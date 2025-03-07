package ru.start.springframework.beanlifestyle;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<Music>();
    private Music music;
    private String name;
    private int volume;
    //    // inversion of control
    public MusicPlayer(Music music) {
        this.music = music;
    } // Внедряем зависимость при помощи конструктора
    public void playMusic() {
        System.out.println("Играет музыка: " + music.getSong());
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
