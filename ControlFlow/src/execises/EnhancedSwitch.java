package src.execises;

public class EnhancedSwitch {

    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        System.out.println("=".repeat(50));
        printDayOfWeek(0, true);
        printDayOfWeek(1, true);
        printDayOfWeek(2, true);
        printDayOfWeek(3, true);
        printDayOfWeek(4, true);
        printDayOfWeek(5, true);
        printDayOfWeek(6, true);
        printDayOfWeek(7, true);

    }

    public static void printDayOfWeek(int day) {

        String dayOfTheWeek  = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 ->  "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }

    public static void printDayOfWeek(int day, boolean notSwitch) {
        String dayOfTheWeek = "Invalid Day";

        if (day == 0) {
            dayOfTheWeek = "Sunday";
        } else if (day == 1) {
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";

        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";

        } else if (day == 4) {
            dayOfTheWeek = "Thursday";

        } else if (day == 5) {
            dayOfTheWeek = "Friday";

        } else if (day == 6) {
            dayOfTheWeek = "Saturday";

        }
        System.out.println(day + " stands for " + dayOfTheWeek);

    }
}
