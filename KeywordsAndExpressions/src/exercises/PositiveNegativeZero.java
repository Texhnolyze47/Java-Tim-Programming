package exercises;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(-1);
    }

    /**
     * Check if a given number is positive, negative or zero
     * @param number - the number being compared to see if it is negative, positive or zero
     */
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
