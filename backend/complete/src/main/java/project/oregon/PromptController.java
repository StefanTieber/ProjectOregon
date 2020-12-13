package project.oregon;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PromptController {

    @CrossOrigin(origins = "*")
    @GetMapping("/prompt")
    public Prompt getPrompt() {
        String question = "Willst du den Chookie essen?";
        String choice1 = "Ja lecker!";
        String choice2 = "Ne bin auf Diät.";
        String choice3 = "Du Schneckli.";
        String choice4 = "Gurkensalat.";
        return new Prompt(question, choice1, choice2, choice3, choice4);
    }
}
