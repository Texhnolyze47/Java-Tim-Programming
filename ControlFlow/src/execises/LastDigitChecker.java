package src.execises;

public class LastDigitChecker {

    public static void main(String[] args) {
        hasSameLastDigit (41, 22, 71);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(isValid(num1) && isValid(num2) && isValid(num3)){
            return (num1%10==num2%10 || num1%10==num3%10 || num2%10==num3%10);
        }
        return false;
    }
    public static boolean isValid(int num){
        return (num>=10 && num<=1000);
    }

}
