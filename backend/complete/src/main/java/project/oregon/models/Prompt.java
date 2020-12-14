package project.oregon.models;

import java.util.Arrays;
import java.util.List;

public class Prompt {
    public String questionId;
    public String question;
    public List<Choice> choices;

    public Prompt() {
    }

    public Prompt(String questionId, String question, List<Choice> choices) {
        this.questionId = questionId;
        this.question = question;
        this.choices = choices;
    }

    public Prompt(String questionId, String question, Choice... choices) {
        this.questionId = questionId;
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

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Prompt choose(String choice) {
        return null;
    }
}
