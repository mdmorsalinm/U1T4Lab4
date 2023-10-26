
public class Player {


    private String name;
    private int score;
    private int wins;
    boolean incorrect;


    public Player(String name) {
        this.name = name;
        score = 0;
        incorrect = false;
    }


    public int getScore() {
        return score;
    }


    public String getName() {
        return name;
    }


    public void incrementScore() {
        score++;
    }


    public void reset() {
        score = 0;
    }
    public void incrementWins() {
        wins++;
    }


    public void resetWins() {
        wins = 0;
    }


    public int getWins() {
        return wins;
    }

    public void setIncorrect() {
        incorrect = true;
    }

    public void resetIncorrect() {
        incorrect = false;
    }

    public boolean getIncorrect() {
        return incorrect;
    }

    public void bonusScore() {
        score += 2;
    }


}