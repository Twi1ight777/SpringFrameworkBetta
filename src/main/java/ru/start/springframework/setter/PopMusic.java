package ru.start.springframework.setter;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Pop music: 'I am a pop singer'";
    }
}
