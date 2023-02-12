package array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        int [] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
//        int min = findMin(vars);
//        System.out.println("Min " + min);
//        reverse(returnedArray);
//        System.out.println("Final " + Arrays.toString(returnedArray));

        int [] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reverse " + Arrays.toString(returnedArray));
        System.out.println("reversed Copy " + Arrays.toString(reversedCopy));
    }

    public static int[]  readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers");
        String input = sc.nextLine();

        String[] splits = input.split(",");
        System.out.println("Splits " + Arrays.toString(splits));
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

    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("-->" + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int number: array){
            reversedArray[maxIndex--] = number;
        }
        return  reversedArray;
    }

}
