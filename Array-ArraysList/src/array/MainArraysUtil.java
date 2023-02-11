package array;

import java.util.Arrays;
import java.util.Random;

public class MainArraysUtil {

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fouthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fouthArray));

        Arrays.sort(fouthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fouthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able","Jane","Mark","Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        // Este metodo regresa -1 en caso de no este el elemento que se busca
        //En caso de que tenga valor duplicados es mejor usar otros metodos
        if (Arrays.binarySearch(sArray,"Mark") >= 0){
            System.out.println("Found Marl in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }
    }

    /**
     * Este metodo genera 10 numero aleatorios en un rango de 0 99
     * @param len es la canntidad de numero que genera el metodo
     * @return int[]
     */
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
