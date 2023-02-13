package _abstract.exercise;

public class Cereal extends ProductForSale {
    public Cereal(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName());
        System.out.println("-".repeat(50));
        System.out.printf("$ %.2f ---- %s %n", price, description);
    }
}
