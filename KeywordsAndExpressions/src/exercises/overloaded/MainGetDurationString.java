package exercises.overloaded;

public class MainGetDurationString {

    public static void main(String[] args) {
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(65,56));
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid for seconds (" + seconds
                    + "), must be a positive integer value";
        } else {
            int minutes = seconds / 60;
            return getDurationString(seconds / 60, seconds % 60);
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0){
            return "Invalid for minutes (" + minutes
                    + "), must be a positive integer value";
        }
        if (seconds <= 0 || seconds >= 59){
            return "Invalid data for seconds (" + seconds
                    + "), must be a 0 and 59";
        }
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }
}
