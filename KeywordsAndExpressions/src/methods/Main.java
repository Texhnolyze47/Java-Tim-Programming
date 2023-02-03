package methods;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("El puntaje mas alto es: " + finalScore);

        calculateScore(true, 10000,8,200);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("La siguiente puntuacion más alto es: " +
                calculateScore(gameOver,score,levelCompleted,bonus));

    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus){


        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }
    return finalScore;
    }
}
