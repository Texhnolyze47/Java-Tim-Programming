package src.execises;

public class PrimeNumber {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 50; i++){
            if (isPrime(i)){
                System.out.println("Prime number " + i);
                count++;
                if (count == 3){
                    System.out.println("Found 3 - exiting for loop");
                    break;
                }
            }
        }
        System.out.println("The number of prime " + count);
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }
}
