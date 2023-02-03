package exercises;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);
    }

    /**
     * Converts a given value in kilometers per hour to mile per hour
     * and return the value
     * @param kilometersPerHour A double value representing the value in kilometers
     * per hour to be converted
     * @return A long value representing the converted value in miles per hour or
     * -1 if the input value is negative
     */
    public static long toMilesPerHour(double kilometersPerHour){

        if ( kilometersPerHour < 0){
            return -1;
        }
        return (long) (Math.round(kilometersPerHour * 0.62137119));
    }

    /**
     * Prints the result of a given value in kilometers per hour to miles
     * @param kilometersPerHour A double value representing the value in kilometers
     * per hour to be converted
     */
    public static void printConversion (double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h.");
    }
}
