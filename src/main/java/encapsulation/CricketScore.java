package encapsulation;

public class CricketScore {
    private int score;

    public int getScore() {
        return score;
    }

    public int setScore(int score) {
        this.score = score;
        return score;
    }

    public static void main(String args[]) {
        CricketScore scores = new CricketScore();
        int score = scores.getScore();
        score = 7;
        System.out.println(scores.getScore());
        System.out.println(scores.setScore(score + 4));
        System.out.println(scores.getScore());
    }
}
