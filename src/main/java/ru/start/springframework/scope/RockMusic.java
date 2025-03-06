package ru.start.springframework.scope;

public class RockMusic implements Music  {
    @Override
    public String getSong() {
        return "Rock Music: 'Beautiful Day'";
    }
}
