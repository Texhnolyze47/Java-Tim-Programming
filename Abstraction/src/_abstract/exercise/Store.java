package _abstract.exercise;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new Milk("Dairy", 5.00, "One carton of milk"));
        storeProducts.add(new Cereal("Grain", 2.00, "One carton of cereal"));
        storeProducts.add(new Eggs("_abstract.Animal", 20.00, "Dozen of eggs"));
        storeProducts.add(new Milk("Dairy", 10.00, "One premium carton of milk"));

        listProducts();
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1 ,2);
        addItemToOrder(order1, 0 ,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3 ,5);
        addItemToOrder(order2, 0 ,1);
        addItemToOrder(order2, 2 ,1);
        printOrder(order2);
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                      int qty){
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }


    public static void listProducts(){
        System.out.println("Store list");
        System.out.println("-".repeat(50));

        for (var product : storeProducts){
            product.showDetails();
        }
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order){
            item.product().printLineItem(item.qty());
            salesTotal += item.product().getSalePrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
