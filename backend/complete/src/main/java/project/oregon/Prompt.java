package project.oregon;

import java.util.ArrayList;
import java.util.List;

public class Prompt {
    private String question;
    private List<Choice> choices = new ArrayList<>();

    public Prompt(String question, List<Choice> choices) {
        this.question = question;
        this.choices = choices;
    }

    public Prompt(String question, String... choiceStrings) {
        this.question = question;
        int id = 1;
        for (String choice : choiceStrings) {
            this.choices.add(new Choice(id, choice));
            id++;
        }
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void addChoice(Choice choice) {
        this.choices.add(choice);
    }

    public List<Choice> getChoices() {
        return choices;
    }
}
