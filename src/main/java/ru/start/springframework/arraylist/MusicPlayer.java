package ru.start.springframework.arraylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    // Внедряем конкретные бины через @Qualifier
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    // Метод playMusic с выбором жанра через enum
    public void playMusic(Genre genre) {
        Music selectedMusic = null;

        switch (genre) {
            case CLASSIC:
                selectedMusic = classicalMusic;
                break;
            case ROCK:
                selectedMusic = rockMusic;
                break;
            default:
                System.out.println("Неизвестный жанр");
                return;
        }

        if (selectedMusic != null) {
            System.out.println("Играет: " + selectedMusic.getSong());
        } else {
            System.out.println("Ошибка. NULL");
        }
    }
}
