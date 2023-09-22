package hu.progmatic.kopapirollo_spring.service;

import hu.progmatic.kopapirollo_spring.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BasicGameService implements GameService {

    private final Random randomGenerator;

    private final List<String> choiceList = new ArrayList<>();



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

        String compChoice = computerChoice();

        if (choice.equalsIgnoreCase(compChoice)) {
            return "DRAW" + compChoice;
        } else if ((choice.equalsIgnoreCase("Rock") && compChoice.equalsIgnoreCase("Scissors")) ||
                (choice.equalsIgnoreCase("Scissors") && compChoice.equalsIgnoreCase("Paper")) ||
                (choice.equalsIgnoreCase("Paper") && compChoice.equalsIgnoreCase("Rock"))) {
            return "Player WINS" + compChoice;
        } else {
            return "Computer WINS" + compChoice;
        }



    }
// ez nagyon ocsmány, de legalább nem jó na majd átírjuk


}
