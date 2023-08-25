package OOPS;

class CricketScorer {
    private int score;

    public int getScore() {
        return score;
    }

    public void setFourScore() {
        this.score +=4;
    }
    public void setSixScore() {
        this.score +=6;
    }
    public void showScore(){
        System.out.println(score);
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        CricketScorer scorer = new CricketScorer();
        //Approach ->1
        //scorer.score= scorer.score+4;

        //Approach ->2
        //scorer.setScore(scorer.getScore()+4);

        //Approach ->3
        scorer.setFourScore();
        scorer.setSixScore();
        scorer.showScore();
    }

}


