package exercises.encapsulation;

public class Main {

    public static void main(String[] args) {
//        Printer printer = new Printer(101,true);
//
//        System.out.println("Initial page count = " + printer.getPagesPrinted());
//
//        int pagesPrinted = printer.printPages(5);
//        System.out.printf("Current Job pages: %d, Printer Total: %d %n",
//                pagesPrinted, printer.getPagesPrinted());
//
//
//        pagesPrinted = printer.printPages(10);
//        System.out.printf("Current Job pages: %d, Printer Total: %d %n",
//                pagesPrinted, printer.getPagesPrinted());

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}
