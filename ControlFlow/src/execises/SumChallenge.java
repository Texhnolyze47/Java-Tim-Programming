package src.execises;

public class SumChallenge {

    public static void main(String[] args) {
        int sumAll = 0;
        int divisableNumbers = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0  && i % 5 == 0){
                System.out.println(i + " is divide by 3 and 5");
                divisableNumbers++;
                sumAll += i;
                if (divisableNumbers == 5){
                    break;
                }
            }
        }
        System.out.println("Sum is " + sumAll );
    }

    public static void sum3And5(){

    }
}
