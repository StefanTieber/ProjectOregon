package project.oregon.models;

public class Choice {
    private String id;
    private String choice;

    public Choice(String id, String choice) {
        this.id = id;
        this.choice = choice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
