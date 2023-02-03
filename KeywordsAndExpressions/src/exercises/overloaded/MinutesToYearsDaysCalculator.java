package exercises.overloaded;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long day = hours / 24;
            long year = day / 365;

            long remainingDays = day % 365;

            System.out.println(minutes + " min = " + year + " y " + "and " + remainingDays + " d" );
        }
    }
}
