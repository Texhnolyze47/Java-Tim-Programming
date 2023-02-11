package array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum {

    public static void main(String[] args) {
        int [] vars = readIntegers();
        System.out.println(Arrays.toString(vars));
        int min = findMin(vars);
        System.out.println("Min " + min);
    }

    public static int[]  readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers");
        String input = sc.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;


    }

    public static int findMin(int [] array){
        int smallest = Integer.MAX_VALUE;

        for (int number: array){
            if (number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    ;
}
