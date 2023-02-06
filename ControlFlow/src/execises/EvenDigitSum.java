package src.execises;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        int currentNumber = number;

        while (currentNumber > 0){
            int lastDigit = currentNumber % 10;
            if (lastDigit % 2 == 0){
                sum = sum + lastDigit;
            }
            currentNumber = currentNumber/ 10;
        }

        return sum;
    }
}
