package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(),type);
    }

}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] grocceryArray = new GroceryItem[3];
        //Este primer objeto es usando el contructor implicito
        grocceryArray[0] = new GroceryItem("Milk");
        //Este es usando el contructor que viene por defecto
        grocceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        grocceryArray[2] = new GroceryItem("oragens","PRODUCE",5);
        System.out.println(Arrays.toString(grocceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("yogourt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges","PRODUCE",5));
        //groceryList.add(0,
        //        new GroceryItem("apples","PRODUCE",6));
        groceryList.set(0,
                        new GroceryItem("apples","PRODUCE",6));
        groceryList.remove(1);
        System.out.println(groceryList);



    }
}
