package project.oregon.prompts;

import project.oregon.businesslogic.PromptController;
import project.oregon.models.Prompt;

import java.util.Arrays;

import static project.oregon.constants.Choices.*;

public class EatPrompt extends Prompt {

    public EatPrompt() {
        super();
        this.choices = Arrays.asList(CHEESEBURGER, POMMES, SOSSEN, SALAT);
    }

    @Override
    public Prompt choose(String choice) {
        String previousFoodChoice = getPreviousFoodChoice();
        if (previousFoodChoice == null || previousFoodChoice.equals(choice)) {
            return new Washmachine();
        } else {
            return new DifferentEat();
        }
    }

    private String getPreviousFoodChoice() {
        if (PromptController.choices.size() < 3) {
            return null;
        }
        return PromptController.choices.get(PromptController.choices.size() - 3);
    }
}
