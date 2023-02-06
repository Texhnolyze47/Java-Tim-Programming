package src.execises;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while (number > 9 ){
            number /= 10;
        }
        return lastDigit + number;
    }
}
