package exercises;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    /**
     *Compares two decimal numbers to determine if they are equal to three decimal places.
     * @param firstNumber the first decimal number to be compared
     * @param secondNumber the second decimal number to be compared
     * @return a boolean indicating whether the two numbers are equal to three decimal places
     * or not
     */
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return (int) (firstNumber * 1000) == (int) (secondNumber * 1000);
    }
}
