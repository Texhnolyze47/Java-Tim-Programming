package src.execises;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        //System.out.println(isLeapYear(-1600));
        System.out.println(getDaysInMouth(-1,2018));
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
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

    public static int getDaysInMouth(int mouth, int year){
        if (mouth < 1 || mouth < 12){
            int daysMouth;
            if (isLeapYear(year)){
                daysMouth =  switch (mouth){
                    case 1,3,5,7,8,10,12 -> 31;
                    case 2 -> 29;
                    case 4,6,9,11 -> 30;
                    default -> -1;
                };
            } else {
                daysMouth =  switch (mouth){
                    case 1,3,5,7,8,10,12 -> 31;
                    case 2 -> 28;
                    case 4,6,9,11 -> 30;
                    default -> -1;
                };
            }
            return daysMouth;
        } else {
            return -1;
        }
    }
}
