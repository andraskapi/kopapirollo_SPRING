package hu.progmatic.kopapirollo_spring.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public interface GameService {



    String computerChoice();

    String gameResult(String choice);


}
