package ru.start.springframework.beanlifestyle;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
//    public void goMyInit() {
//    System.out.println("PopMusic bean initialized");
//    }
//    public void goMyDestroy() {
//        System.out.println("PopMusic bean destroyed");
//    }
    @Override
    public String getSong() {
        return "Pop music: 'I am a pop singer'";
    }
}
