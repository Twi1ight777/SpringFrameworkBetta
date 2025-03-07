package ru.start.springframework.arraylist;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // Объекты этого компонента будут использоваться по умолчанию, если не указано другого
@Scope("singleton") //
public class ClassicalMusic implements Music {
private List<String> classicalSongs = new ArrayList<String>();

    @PostConstruct
    public void doMyInit() {
        System.out.println("Classical music component initialized");
    }
    @PreDestroy // Метод вызывается, когда компонент удаляется из контекста
    public void doMyDestroy() {
        System.out.println("Classical music component destroyed");
    }
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
