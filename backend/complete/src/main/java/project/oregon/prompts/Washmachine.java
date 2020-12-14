package project.oregon.prompts;

import project.oregon.businesslogic.ScoreController;
import project.oregon.models.Prompt;

import java.util.Arrays;

import static project.oregon.constants.Choices.*;

public class Washmachine extends Prompt {

    public Washmachine() {
        super();
        this.questionId = "washmachine";
        this.question = "Sehr gerne, möchten Sie auch eine Waschmaschine dazu?";
        this.choices = Arrays.asList(NUR_ESSEN, NEIN_DANKE, HAB_SCHON_EINE, WASCHMASCHINE_JA);
    }

    @Override
    public Prompt choose(String choice) {
        if (choice.equals(WASCHMASCHINE_JA.getId())) {
            ScoreController.increaseScore();
            return new WashmachineEat();
        } else {
            return new NoWashmachineEat();
        }
    }
}
