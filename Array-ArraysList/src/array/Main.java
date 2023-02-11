package array;

import java.util.Arrays;

public class Main {

    public static void main(String[]args){

    int[] integerArray = new int[10];
    integerArray[0] = 45;
    integerArray[1] = 1;
    integerArray[5] = 50;

    double[] doubleArray = new double[10];
    doubleArray[2] = 3.5;
        System.out.println(doubleArray[2]);;

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("Last = " + firstTen[arrayLength-1]);

        int[] newArray;
    //    newArray = new int[]{5,4,3,2,1};
    newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++ ){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        // el primero es una declaracion del elemento que interar de forma interna
        // es como la i que usamos en el for tradicional
        // el segundo es array que va iterar
        for(int element : newArray){
            System.out.print(element + " ");
        }
        System.out.println();
        //Esto da un referencia de memoria
        //esto porque la clase array no tiene un metodo toString
        //System.out.println(newArray);
        //Pero tiene clase java utli.Array
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if ( objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectsArray = new Object[3];
        objectsArray[0] = "Hello";
        objectsArray[1] = new StringBuilder("World");
    }
}
