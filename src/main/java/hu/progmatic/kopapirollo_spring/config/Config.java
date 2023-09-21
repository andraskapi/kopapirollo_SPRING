package hu.progmatic.kopapirollo_spring.config;

import ch.qos.logback.classic.spi.ConfiguratorRank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class Config {

    @Bean
    public Random getRandomGenerator(){
        return new Random();
    }
}
