package BasicJava;

public class score {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (score < 5000 && score > 1000){
            System.out.println("Your score is greater than 5000 but less than 1000.");
        }else if(score < 1000) {
            System.out.println("Your score is less than 1000.");
        }else{
            System.out.println("Got Here.");
        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("You r final score: " + finalScore);
        }
    }
}
