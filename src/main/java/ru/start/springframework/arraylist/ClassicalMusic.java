package ru.start.springframework.arraylist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component // Объекты этого компонента будут использоваться по умолчанию, если не указано другого
public class ClassicalMusic implements Music {
private List<String> classicalSongs = new ArrayList<String>();

    // Инициализация списка в конструкторе
    public ClassicalMusic() {
        classicalSongs.add("The Magic Flute");
        classicalSongs.add("Moonlight Sonata");
        classicalSongs.add("Symphony No. 5");
    }

    @Override
    public Genre getGenre() {
        return Genre.CLASSIC;
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return classicalSongs.get(random.nextInt(classicalSongs.size()));
    }
}
