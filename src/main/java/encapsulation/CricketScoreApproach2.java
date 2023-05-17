package encapsulation;

public class CricketScoreApproach2 {
    private int score;

    public int four(){
        score+=4;
        return score;
    }
    public static void main(String[] args){
        CricketScoreApproach2 scores = new CricketScoreApproach2();
        System.out.println(scores.four());
    }
}
