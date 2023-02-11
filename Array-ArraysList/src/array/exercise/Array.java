package array.exercise;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int [] generatedArray = getRandomArray(10);
        System.out.println("Before sorted " + Arrays.toString(generatedArray));
        generatedArray = sortIntegerArray(generatedArray);
        System.out.println("After sort" + Arrays.toString(generatedArray));

        int[] sortedArray = sortIntegerArray(new int[] {7,30,35});
        System.out.println(Arrays.toString(sortedArray));




    }

    public static int[] getRandomArray(int length){
        Random randomNumbers = new Random();
        int [] randomArray = new int[length];

        for (int i = 0; i < length; i++){
            randomArray[i] = randomNumbers.nextInt(100);
        }
        return randomArray;
    }

    public static int [] sortArray(int [] array){
        int [] sortedArray = Arrays.copyOf(array,array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public static int [] sortIntegerArray(int [] array){
        System.out.println(Arrays.toString(array));
        int [] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
