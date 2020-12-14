package project.oregon.businesslogic;

import org.springframework.stereotype.Service;
import project.oregon.models.Prompt;

import java.util.ArrayList;
import java.util.List;

import project.oregon.prompts.*;

@Service
public class PromptController {
    public static List<String> choices = new ArrayList<>();
    private Prompt prompt = new NeutralEat();

    public Prompt getPrompt() {
        return prompt;
    }

    public void choose(String choice) {
        choices.add(choice);
        prompt = prompt.choose(choice);
    }
}
