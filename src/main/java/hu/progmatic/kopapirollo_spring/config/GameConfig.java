package hu.progmatic.kopapirollo_spring.config;

import hu.progmatic.kopapirollo_spring.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class GameConfig {

    @Bean
    public Game game(String choice){
        Game game = new Game();
        game.setChoice(choice);
        return game;

    }
    @Bean
    public String choice(Random random){
        return random.toString();  // ez nem lesz jó
    }

    @Bean
    public Random getRandomGenerator(){
        return new Random();
    }
}
