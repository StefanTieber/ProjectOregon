package project.oregon.models;

import java.util.Arrays;
import java.util.List;

public class Prompt {
    private String question;
    private List<Choice> choices;

    public Prompt(String question, List<Choice> choices) {
        this.question = question;
        this.choices = choices;
    }

    public Prompt(String question, Choice... choices) {
        this.question = question;
        this.choices = Arrays.asList(choices);
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
