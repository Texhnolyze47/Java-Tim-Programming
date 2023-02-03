package constructor;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();

        System.out.println("Nombre " + customer.getName() +
                " limite de credito " + customer.getEmail() +
                " luis@mail.com");

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());
    }
}

