package exercises.overloaded;

public class MainIchesToCentimeters {

    public static void main(String[] args) {
        System.out.println("first method " + convertToCentimeters(68));
        System.out.println("Second method " + convertToCentimeters(5,8));
    }

    /**
     * Converts a given value in inches to centimeters
     * @param inches A Integer value representing the converted value in iches
     * @return a double value the converted value in inches
     */
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    /**
     * Convert two values from feet and inches to just inches
     * @param feet a given value in feet to iches
     * @param inches a given value in inches that is to be added
     * @return a double value the converted feet and remainder inches
     */
    public static double convertToCentimeters(int feet, int inches){
        int feetInches = feet * 12;
        int totalInches = feetInches + inches;
        double remainderInches = convertToCentimeters(totalInches);
        return  remainderInches;
    }
}
