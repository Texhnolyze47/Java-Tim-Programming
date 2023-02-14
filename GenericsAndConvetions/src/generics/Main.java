package generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //The problem with declaring an arraylist in this way
        // is that it eliminates the type check.
        ArrayList <Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("tim");
        items.add(6);

        printDouble(items);
    }

    private static void printDouble(ArrayList<Integer> n){
        for(int i : n){
            System.out.println(i * 2);
        }
    }
}
