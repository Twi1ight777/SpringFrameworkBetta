package ru.start.springframework.arraylist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> rockSongs = new ArrayList<>();

    // Инициализация списка в конструкторе
    public RockMusic() {
        rockSongs.add("Bohemian Rhapsody");
        rockSongs.add("Stairway to Heaven");
        rockSongs.add("Sweet Child O' Mine");
    }

    @Override
    public Genre getGenre() {
        return Genre.ROCK;
    }

    @Override
    public String getSong() {
        // Возвращаем случайную песню из списка
        Random random = new Random();
        return rockSongs.get(random.nextInt(rockSongs.size()));
    }

}
