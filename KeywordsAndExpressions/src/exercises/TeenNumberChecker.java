package exercises;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));


    }

    /**
     * Determines if any of three given numbers is within the range of a teen
     * number
     * @param numberA the first number to be evaluated
     * @param numberB the second number to be evaluated
     * @param numberC the third number to be evaluated
     * @return a boolean value indicating whether any of the
     * numbers is a teen numbers or not
     */
    public static boolean hasTeen(int numberA, int numberB, int numberC){
        if ((numberA >= 13 && numberA <= 19) || (numberB >= 13 && numberB <= 19) || (numberC >= 13 && numberC <= 19)){
            return true;
        }
        return false;
    }

    /**
     * Determines if a given number is within the range of a teen number
     * @param numberA the number to be evaluated
     * @return a boolean value indicating whether the numver is a teen number or not
     */
    public static boolean isTeen (int numberA){
        if (numberA >= 13 && numberA <= 19){
            return true;
        }
        return false;
    }
}
