package hu.progmatic.kopapirollo_spring.service;

import hu.progmatic.kopapirollo_spring.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BasicGameService implements GameService{

    private final Random randomGenerator;

    private final List<String> choiceList = new ArrayList<>();

    @Autowired
    public BasicGameService(Random random){

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
    public void gameResult(String choice) {

        String compChoice = computerChoice();

        if (choice.equalsIgnoreCase(compChoice) ){
            System.out.println("DRAW");
        }

        if (choice.equalsIgnoreCase("Rock") && compChoice.equalsIgnoreCase("Paper")){
            System.out.println("Computer WINS");
        } else if (choice.equalsIgnoreCase("Paper") && compChoice.equalsIgnoreCase("Scissors")) {
            System.out.println("Computer WINS");

        } else if (choice.equalsIgnoreCase("Scissors") && compChoice.equalsIgnoreCase("Rock")) {
            System.out.println("Computer WINS");

        }else {
            System.out.println("Player WINS");
        }
    }
    // ez nagyon ocsmány, de majd átírjuk





}
