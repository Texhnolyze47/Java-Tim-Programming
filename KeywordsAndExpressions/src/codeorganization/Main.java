package codeorganization;

public class Main {
    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("Esto es una prueba");
        System.out.println("Esto es " +
                "otra" +
                "más");
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        if (myVariable == 0){
            System.out.println("Es un zero");
        }
    }
}
