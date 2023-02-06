package src.execises._scanner;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCout = 0;

        while (true){
            System.out.println("Enter a number");
            String inputNumber = sc.nextLine();
            try {
                double number = Double.parseDouble(inputNumber);
                if (loopCout == 0 || number < min){
                    min = number;
                }
                if (loopCout == 0 || number > max){
                    max = number;
                }
                loopCout++;

            }catch (NumberFormatException badInput){
                break;
            }

            if (loopCout > 0){
                System.out.println("min = " + min + ", max =" + max);
            } else {

            }

        }

    }
}
