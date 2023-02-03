package exercises;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,4));

    }

    /**
     * Determines whether the dog should be woken up based on two inputs
     * @param barking a boolean value representing whether the dog is barking or not
     * @param hourDay an integer value representing the hour the day (0-23)
     * @return a boolean value indicating whether the dog should be woke up
     */
    public static boolean shouldWakeUp(boolean barking, int hourDay){
        if (barking){
            if (hourDay >= 0 && hourDay <= 23){
                if (hourDay < 8 || hourDay > 22){
                    return true;
                }
            }else {
                return false;
            }
        }
        return false;
    }
}
