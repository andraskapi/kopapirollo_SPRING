package hu.progmatic.kopapirollo_spring.service;

import hu.progmatic.kopapirollo_spring.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BasicGameService implements GameService {

    private final Random randomGenerator;

    private final List<String> choiceList = new ArrayList<>();
    private String computerSChoice;


    @Autowired
    public BasicGameService(Random random) {

        this.randomGenerator = random;
        choiceList.add("Rock");
        choiceList.add("Paper");
        choiceList.add("Scissors");

    }

    @Override
    public String computerChoice() {
        return choiceList.get(randomGenerator.nextInt(choiceList.size()));
    }


    @Override
    public String gameResult(String choice) {

        computerSChoice = computerChoice();

        if (choice.equalsIgnoreCase(computerSChoice)) {
            return "DRAW";
        } else if ((choice.equalsIgnoreCase("Rock") && computerSChoice.equalsIgnoreCase("Scissors")) ||
                (choice.equalsIgnoreCase("Scissors") && computerSChoice.equalsIgnoreCase("Paper")) ||
                (choice.equalsIgnoreCase("Paper") && computerSChoice.equalsIgnoreCase("Rock"))) {
            return "Player WINS";
        } else {
            return "Computer WINS";
        }



    }
// ez nagyon ocsmány, de legalább nem jó na majd átírjuk


    public String getComputerSChoice() {
        return computerSChoice;
    }
}


