package linkedlist.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Town> placesToVisit = new LinkedList<>();

        Town adelaide = new Town("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Town("adelaide", 1374));
        addPlace(placesToVisit, new Town("Brisbane", 917));
        addPlace(placesToVisit, new Town("Perth", 3923));
        addPlace(placesToVisit, new Town("Alice Springs", 2771));
        addPlace(placesToVisit, new Town("Darwin", 3972));
        addPlace(placesToVisit, new Town("Melbourne", 877));

        placesToVisit.addFirst(new Town("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop){
            if (!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasPrevious()){
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter value: ");
            // saves the first character received from the keyboard
            String menuItem = sc.nextLine().toUpperCase().substring(0,1);
            switch (menuItem){
                case "F" -> {
                    System.out.println("Foward");
                    if (!forward){
                        forward = true;
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("Backwards");
                    if (forward){
                        forward = false;
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                }
                case "M" -> printMenu();
                case "L" -> System.out.println(placesToVisit);
                default -> quitLoop = true;

            }
        }
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    private static void addPlace(LinkedList<Town> list, Town place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Town p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace: list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }

            matchedIndex++;
        }

        list.add(place);
    }
}
