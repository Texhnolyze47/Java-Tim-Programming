package methods.challenge;

public class MethodChallenge {
    public static void main(String[] args) {
        String name = "Luis";
        int score = 800;
        displayHighScorePosition(name,score);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " esta en la posicion "
                + calculateHighScore(highScorePosition) + " en la posicion de puntajes altos");
    }

    public static int calculateHighScore(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        else
            return 4;
    }
}
