package src.execises;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber > 99) || (firstNumber < 10) || (secondNumber > 99) || (secondNumber < 10)) {
            return false;
        } else {
            return ((firstNumber / 10 == secondNumber / 10) || (firstNumber / 10 == secondNumber % 10) || (secondNumber / 10 == firstNumber % 10) || (firstNumber % 10 == secondNumber % 10));
        }
    }
}
