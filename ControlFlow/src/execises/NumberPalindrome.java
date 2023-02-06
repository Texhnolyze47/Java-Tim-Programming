package src.execises;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome(int number){

        if (number < 0){
            number *= -1;
        }

        int reverse = 0;
        int currentNumber = number;
        while ( currentNumber > 0){

            int lastDigit = currentNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            currentNumber /= 10;
            //lastDigit = reverse;
        }

        if (number == reverse){
            return true;
        } else {
            return false;
        }
    }

}
