package constructor;

public class Customer {

    private String name;
    private Double creditLimit;
    private String email;
    public Customer() {
        this("Luis",10_000.00,"Luis@correo.com");
    }

    public Customer(String name, String email) {
        this(name,10_000.00,email);
    }

    public Customer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
