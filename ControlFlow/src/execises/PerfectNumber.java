package src.execises;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int perfectNumber = 0;
            for (int i = 1; i < number; i++) {
                int factor = number % i ;
                if (factor == 0){
                    perfectNumber += i;
                }

            }
            return perfectNumber == number && number > 1;
    }
}
