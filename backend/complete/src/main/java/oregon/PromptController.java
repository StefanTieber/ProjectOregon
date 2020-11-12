package oregon;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PromptController {
    private String promtQuestion = "Cookie essen?";
    private String choiceText1 = "Mhh, lecka";
    private String choiceText2 = "Nee lass mal";
    private String choiceText3 = "Freie Liebe!";
    private String choiceText4 = "Du Schneckli";

    private int insultCount = 0;
    private List<Insult> insultList;

    public PromptController() {
        initInsultList();
    }

    private void initInsultList() {
        insultList = new ArrayList<>();
        insultList.add(new Insult("Hodenkobold"));
        insultList.add(new Insult("Neger"));
        insultList.add(new Insult("Robert"));
        insultList.add(new Insult("Hendl"));
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/prompt")
    public Prompt getPrompt() {
        Prompt prompt = new Prompt();
        prompt.setQuestion(promtQuestion);
        prompt.addChoice(createTestChoice(1, choiceText1));
        prompt.addChoice(createTestChoice(2, choiceText2));
        prompt.addChoice(createTestChoice(3, choiceText3));
        prompt.addChoice(createTestChoice(4, choiceText4));

        return prompt;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/insult")
    public Insult getInsult() {
        insultCount++;
        return insultList.get(insultCount % insultList.size());
    }

    private Choice createTestChoice(int id, String choiceText) {
        Choice c = new Choice();
        c.setId(id);
        c.setChoice(choiceText);
        return c;
    }
}
