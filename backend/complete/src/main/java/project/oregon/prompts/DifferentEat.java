package project.oregon.prompts;

import project.oregon.models.Prompt;

public class DifferentEat extends EatPrompt {

    public DifferentEat() {
        super();
        this.questionId = "differentEat";
        this.question = "Sie haben vorher aber was anderes gesagt, was wollen Sie denn jetzt?";
    }

    @Override
    public Prompt choose(String choice) {
        return new Washmachine();
    }
}
