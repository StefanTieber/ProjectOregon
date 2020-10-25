package oregon;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromptController {
    private String promtQuestion = "Cookie essen?";
    private String choiceText1 = "Mhh, lecka";
    private String choiceText2 = "Nee lass mal";
    private String choiceText3 = "Freie Liebe!";
    private String choiceText4 = "Du Schneckli";


    @CrossOrigin(origins = "*")
    @GetMapping("/prompt")
    public Prompt getPrompt(){
        Prompt prompt = new Prompt();
        prompt.setQuestion(promtQuestion);
        prompt.addChoice(createTestChoice(1, choiceText1));
        prompt.addChoice(createTestChoice(2, choiceText2));
        prompt.addChoice(createTestChoice(3, choiceText3));
        prompt.addChoice(createTestChoice(4, choiceText4));

        return prompt;
    }

    public Choice createTestChoice(int id, String choiceText){
        Choice c = new Choice();
        c.setId(id);
        c.setChoice(choiceText);
        return c;
    }
}
