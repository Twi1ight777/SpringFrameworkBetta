package ru.start.springframework.setter;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }

//    // inversion of control
//    public MusicPlayer(Music music) {
//        this.music = music;
//    } // Внедряем зависимость при помощи конструктора
//    public MusicPlayer() {} // Пустой конструктор для бина
//    public void setMusic(Music music) {
//        this.music = music;
//    } // Внедряем зависимость при помощи сеттера

    public void setMusicList (List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Играет музыка: " + music.getSong());
        }
    }
}
