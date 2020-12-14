package project.oregon.businesslogic;

public class ScoreController {
    private static int score = 0;

    public static int getScore() {
        return score;
    }

    public static void increaseScore() {
        score++;
    }
}
