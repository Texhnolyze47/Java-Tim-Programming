package src.execises;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
    }
    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            int factor = number % i ;
            if (factor == 0){
                System.out.println(i + "");
            }
        }
    }
}
