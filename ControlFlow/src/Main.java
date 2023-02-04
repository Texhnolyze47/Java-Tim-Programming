package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScaner(currentYear));
        }


    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hola, ¿Cual es tu nombre?");
        System.out.println("Hola " + name + ", gracias por venir");
        String dateOfBirth = System.console().readLine("En que año naciste");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "Entonces tu edad es " + age;
    }

    public static String getInputFromScaner(int currentYear){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ¿Cual es tu nombre?");

        String name = scanner.nextLine();
        System.out.println("Hola " + name + ", gracias por venir");

         System.out.println("En que año naciste");
         boolean validBirth = false;
         int age = 0;
         do {
             System.out.println("Introduce el año de tu nacimiento >= " + (currentYear - 125) + " and <= " + (currentYear));
             try {
             age = checkData(currentYear, scanner.nextLine());
             validBirth = age < 0 ? false : true;

             }catch (NumberFormatException badUserData){
                 System.out.println("Los caracteres no esta permitidos!! intenta otra vez");
             }
         }while (!validBirth);

         return "Entonces tu edad es " + age;
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimunYear = currentYear - 125;

        if ((dob < minimunYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear - dob);
    }
}
