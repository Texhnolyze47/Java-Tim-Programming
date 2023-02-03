package exercises;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,2));
    }

    public static boolean hasEqualSum(int numberA, int numberB, int numberC){

        if ( numberA + numberB == numberC){
            return true;
        }
        return false;

    }

}
