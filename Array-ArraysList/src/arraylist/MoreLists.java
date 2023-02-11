package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples","bananas","milk","eggs"};
        //List.of es un factory method
        // debido a que es un metodo estatico
        List<String> list = List.of(items);
        //List.of transforma el array de string y lo convierte una List de Strings
        System.out.println(list);
        System.out.println(list.getClass().getName());
        //A diferencia de ArrayList list pertenece a una clase inmutable
        //list.add("yogourt");
        // esta da un error
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        //Esto es posible gracias la varargs
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard, cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");

        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("first = " + groceries.lastIndexOf("yogurt"));
        //Metodo remove solo elimina un elemento
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        //tambien podemos eliminar varias cosas a la vez
        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples","milk","mustard","cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        //Esta forma que la que mas hemos utlizado
        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        //tambien se puede usando la clase de ayuda Arrays que ya le hemos usando en Array
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //forma de tener una lista de un array
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
