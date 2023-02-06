package src.execises;

public class SumOddRange {

    public static void main(String[] args) {

        System.out.println(sumOdd(10,5));
    }

    public static boolean isOdd(int number){
        if (number > 0){
            if (number % 2 == 1){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start > 0 && end > 0 && end >=  start){
            for (int i = start; i <= end; i++) {
                if (isOdd(i)){
                    sum += i;
                }
            }
        }else {
            return -1;
        }
        return sum;
    }

}
