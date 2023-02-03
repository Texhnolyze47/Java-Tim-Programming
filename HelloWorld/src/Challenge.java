public class Challenge {
    public static void main(String[] args) {
        double myFirstDouble = 20.00;

        double mySecondDouble = 80.00;

        double multiplyDoubles = (myFirstDouble + mySecondDouble) * 100.00;

        double theRemaider = multiplyDoubles % 40;

        boolean isNotRemaider = (theRemaider == 0.00) ? true : false;

        System.out.println("Es condicion es: " + isNotRemaider);

        if (!isNotRemaider){
            System.out.println("Got some message");
        }
    }
}
