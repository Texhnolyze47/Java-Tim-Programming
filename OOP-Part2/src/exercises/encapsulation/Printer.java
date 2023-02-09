package exercises.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1 && tonerLevel<=100) ? tonerLevel : -1;;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }

    public int printPages(int pages){
       int pagesPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
       if (duplex){
           System.out.println("Printing in duplex mode");
       }
       pagesPrinted += pagesPrint;
       return pagesPrint;

    }

    public int getPagesPrinted(){
        return  pagesPrinted;
    }
}
