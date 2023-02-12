package autoboxing.exercise;

public class Main {

    public static void main(String[] args) {
        Customer bob = new Customer("Ivan", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        //bank.addNewCustomer("Jane A", 500.0);
        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -75.01);
        bank.printStatement("Jane a");

        bank.addTransaction("Bob S", 100);
        bank.printStatement("Bob S");
    }

}
