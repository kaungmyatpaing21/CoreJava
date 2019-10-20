package BasicJava;

public class displayHighScorePosition {
    public static void main(String[] args){
        int score = calculateHighScorePosition(1500);
        showHighScorePosition("Luffy", score);

        score = calculateHighScorePosition(900);
        showHighScorePosition("Zoro", score);

        score = calculateHighScorePosition(400);
        showHighScorePosition("Sanji", score);

        score = calculateHighScorePosition(50);
        showHighScorePosition("Franky", score);

    }

    public static void showHighScorePosition(String crew, int position){
        System.out.println(crew + " managed to get into position " + position + " on the high score.");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if(score >= 500 && score < 1000){
            return 2;
        }else if(score >= 100 && score < 500);{
            return 4;
        }
    }
}
