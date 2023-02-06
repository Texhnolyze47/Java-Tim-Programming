package exercises.exerciseclasses;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345",500,
                "Luis","Luis@mail","2334567");

        bankAccount.deposit(500);


        bankAccount.withDrawing(200);


    }
}
