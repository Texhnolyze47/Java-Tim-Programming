package exercises;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    /**
     * Determines whether a given year is a leap or not
     * @param year an integer value representing the year
     * @return a boolean value indicating whether the year is a leap or not
     */
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
