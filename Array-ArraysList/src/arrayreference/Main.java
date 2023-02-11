package arrayreference;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Cuando usamos el operador new
        //Esto crea un referencia en memoria
        int[] intArray = new int[5];
        //como estamos asginando el valor anterior en la nueva variable
        // estas dos variables estan apuntando mismo registro de memoria
        int[] anotherArray = intArray;

        System.out.println("intArray " + Arrays.toString(intArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArray = "
        + Arrays.toString(intArray));
        System.out.println("After change anotherArray = "
                + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int []array){
        array[1] = 2;
    }
}
