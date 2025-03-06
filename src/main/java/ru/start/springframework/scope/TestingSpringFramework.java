package ru.start.springframework.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingSpringFramework {
    public static void main(String[] args) {
        // Запуск контекста приложения с помощью XML-файла конфигурации.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        "testBean" - id бина. TestBean имя класса. testBean - объект, созданный Spring Framework.
//        ClassicalMusic или RockMusic - наследники Music. В конфигурации можно переключаться между Music и RockMusic.
//        !Music music = context.getBean("musicBean", Music.class); // Надо избежать внедрения вручную music.
//        !MusicPlayer musicPlayer = new MusicPlayer(music); // Надо избежать создания объекта MusicPlayer вручную.
//        1. Создаем Java классы - будущие бины. 2. Связываем бины с помощью XML-файла конфигурации.(или Java кодом)
//        3. Все бины берутся из контейнера Spring.
//        Реализовали Dependency Injection через Конструктор. Внедрили ссылку <constructor-arg ref="musicBean"/>
//        Реализовали Dependency Injection через Setter. Внедрили ссылку <property name="music" ref="musicBean"/>
        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // Внедрение зависимостей
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // Проверка scope singleton
//        firstmusicPlayer.playMusic();
        boolean isSame = firstmusicPlayer == secondmusicPlayer; // Проверка scope singleton
        System.out.println("Ссылки на MusicPlayer совпадают: " + isSame); // Проверка scope singleton

        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer); // Проверка scope singleton. Выводим хэш

        System.out.println(secondmusicPlayer.getVolume());
        firstmusicPlayer.setVolume(50);
        System.out.println(secondmusicPlayer.getVolume()); // Проверка scope singleton. Громкость изменилась

//        System.out.println("Название: " + musicPlayer.getName()); // Проверка внедренных значений
//        System.out.println("Громкость: " + musicPlayer.getVolume()); // Проверка внедренных значений
        context.close();
    }
}
