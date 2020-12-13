package project.oregon.businesslogic;

import org.springframework.stereotype.Service;
import project.oregon.factories.PromptFactory;
import project.oregon.models.Prompt;

import java.util.ArrayList;
import java.util.List;

import project.oregon.constants.ChoiceIds;

@Service
public class PromptController {
    private List<String> choices = new ArrayList<>();
    private String lastChoice;

    public Prompt getPrompt() {
        if (choices.isEmpty()) {
            return PromptFactory.getNeutralEatPrompt();
        } else {
            if (lastChoice.equals(ChoiceIds.ID_WASCHMASCHINE_JA)) {
                return PromptFactory.getWashmachineEatPrompt();
            }
            if (choices.size() % 2 == 1) {
                return PromptFactory.getWashmachinePrompt();
            } else {
                return PromptFactory.getNoWashmachineEatPrompt();
            }
        }
    }

    public void choose(String id) {
        choices.add(id);
        lastChoice = id;
    }
}
