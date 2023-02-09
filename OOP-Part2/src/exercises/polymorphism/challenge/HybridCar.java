package exercises.polymorphism.challenge;

public class HybridCar extends Car {

    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double angKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = angKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders area fired up. %n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}
