package exercises;

public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);

    }

    /**
     * Converts a given value in kilobytes to megabytes and its remainder
     * @param kiloBytes A double value representing the converted value in megabyte
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            double megaBytes = kiloBytes / 1024;
            double remainder = kiloBytes % 1024;
            System.out.println( kiloBytes + " KB = " + (int) megaBytes + " MB and " + (int) remainder  + " KB");
        }
    }

}
