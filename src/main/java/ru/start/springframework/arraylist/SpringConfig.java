package ru.start.springframework.arraylist;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "ru.start.springframework.arraylist")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
