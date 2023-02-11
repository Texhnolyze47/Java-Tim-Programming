package twodimensionalarray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[4][4];
        System.out.println(Arrays.toString(array));
        System.out.println("Array length" + array.length);

        for (int[] outer : array){
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array.length; i++) {
            var innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++) {
                //System.out.print(array[i][j]);
                array[i][j] = (i * 10) + (j + 1);
            }
            System.out.println();
        }

//        for (var outer: array){
//            for (var element : outer){
//                System.out.print( element + " ");
//            }
//            System.out.println();
//        }
        //Con este metodo podemos imprimir un array bidimensional
        System.out.println(Arrays.deepToString(array));

        array[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a","b","c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1","2"},
                {"3","4","5"},
                {"6","7","8","9"}

        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        //anyArray[2] = "hello";
        System.out.println(Arrays.deepToString(anyArray));
        //En general no una buena practica crea array de objetos asi
        // por que el compiler no hacer un type checking y puede dar un error sí metemos un string
        // es vez de un array como hemos ehco
        // aqui estamos usando un iterador que es un objeto
        // no un array de objetos
        for (Object element : anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            //Nosotros sabes que esto es un array pero java no lo sabe por esto
            // necesitamos castear un array de objecto
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
