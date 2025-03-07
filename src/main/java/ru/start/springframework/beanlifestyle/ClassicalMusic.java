package ru.start.springframework.beanlifestyle;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClassicalMusic implements Music {
//    private ClassicalMusic() {} // Паттерн Фабричного метода
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic(); // Scope singleton независимо от mew ClassicalMusic. Объект создается один раз
//    }

//    public void goMyInit() {
//        System.out.println("ClassicalMusic bean initialized");
//    }
//    public void goMyDestroy() {
//        System.out.println("ClassicalMusic bean destroyed");
//    }
    @Override
    public String getSong() {
        return " Classical Music: 'The Magic Flute'  ";
    }
}
