package src.execises;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits (int number){
        int sum = 0;
        if (number > 0){
            while (number > 9){
                sum += number % 10;
                number = number / 10;
            }
            sum += number;
        }
        else {
            return -1;
        }
        return sum;

    }

}
