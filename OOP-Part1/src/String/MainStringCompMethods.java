package String;

public class MainStringCompMethods {

    public static void main(String[] args) {
        printInformation("Hola Mundo");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hola Mundo";
        System.out.printf("index of n = %d %n", helloWorld.indexOf('n'));
        System.out.printf("index of Mundo = %d %n", helloWorld.indexOf("Mundo"));

        System.out.printf("index of o = %d %n", helloWorld.indexOf('o'));
        System.out.printf("index of o = %d %n", helloWorld.lastIndexOf('o'));

        System.out.printf("index of o = %d %n", helloWorld.indexOf('o'));
        System.out.printf("index of o = %d %n", helloWorld.lastIndexOf('o'));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hola")){
            System.out.println("String starts with hola");
        }
        if (helloWorld.endsWith("Mundo")){
            System.out.println("String ends with mundo");
        }
        if (helloWorld.contains("Mundo")){
            System.out.println("String contains mundo");
        }
        // contentEquals puede ser utlizado en stringbuilder a diferencia de equals
        if (helloWorld.contentEquals("Hola Mundo")){
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string){

        int length = string.length();

        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n ", string.charAt( length - 1));
    }
}
