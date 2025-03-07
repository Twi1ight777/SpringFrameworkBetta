package ru.start.springframework.beanlifestyle;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
//    public void goMyInit() {
//        System.out.println("RockMusic bean initialized");
//    }
//    public void goMyDestroy() {
//        System.out.println("RockMusic bean destroyed");
//    }
    @Override
    public String getSong() {
        return "Rock Music: 'Beautiful Day'";
    }
}
