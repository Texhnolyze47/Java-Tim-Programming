package String;

public class StringBuilderMethods {

    public static void main(String[] args) {
        String helloWorld = "hello" + "world";
        // La clase String de java es inmutable
        helloWorld.concat("and goodbye");
        // es importante recordar de asignar una variable de resultado
        // cuando usamos una metodo de string

        StringBuilder helloWorldBuilder =  new StringBuilder("Hello " + "World ");
        //La clase StringBuilder es mutable
        helloWorldBuilder.append("and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus =  new StringBuilder("Hello " + "World ");
        //La clase StringBuilder es mutable
        builderPlus.append("and goodbye");
        builderPlus.deleteCharAt(16).insert(16,'g');

        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation (String string){
        System.out.println("String  = " + string);
        System.out.println("length  = " + string.length());
    }

    public static void printInformation (StringBuilder builder){
        System.out.println("String  = " + builder);
        System.out.println("length  = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
