package arraylist.exercise;

import java.util.*;

public class ArrayListMain {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        int op;
        do {
            menu();
            op = sc.nextInt();
            sc.nextLine();
            options(op, groceryList);
            if (groceryList.isEmpty()){
                System.out.println("No list");
            }else {
                groceryList.sort(Comparator.naturalOrder());
                System.out.println(groceryList);
            }
        } while (op != 0);

    }

    public static void menu() {
        String textBlock = """
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                """;
        System.out.print(textBlock + " ");
    }


    public static void options(int op, ArrayList<String> groceryList) {
        switch (op) {
            case 1 -> addItem(groceryList);
            case 2 -> removeItem(groceryList);
            default -> System.out.println("Invalid input");
        }
    }
    public static void addItem(ArrayList<String> groceries) {
        System.out.println("Input the list ");

        String[] listSplit = sc.nextLine().split(",");
        for (String i : listSplit) {
            //Gets the first element of the matrix
            //cleans white spaces
            String trimmed = i.trim();
            //Check whether the trimmed item is in the list.
            if (groceries.indexOf(trimmed) < 0) {
                // If not it is added to the arrayList
                groceries.add(trimmed);
            }
            // If found, the item is not added to the arraylist.
        }
    }

    public static void removeItem(ArrayList<String> groceries) {
        System.out.println("Input the list ");

        String[] listSplit = sc.nextLine().split(",");
        for (String i : listSplit) {
            //Obtiene el primer elemento de la matriz
            //limpia los espacios blancos
            String trimmed = i.trim();
            //Elimina los elementos
            groceries.remove(trimmed);
        }
    }

}
