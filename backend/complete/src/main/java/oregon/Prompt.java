package oregon;

import java.util.ArrayList;
import java.util.List;

public class Prompt {
    private String question;
    private List<Choice> choice;

    public Prompt() {
        this.choice = new ArrayList<>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void addChoice(Choice choice) {
        this.choice.add(choice);
    }

    public void setChoice(List<Choice> choice) {
        this.choice = choice;
    }

    public List<Choice> getChoice() {
        return choice;
    }
}
