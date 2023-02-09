package exercises.kitchen;

public class SmartKitchen {
    private CoffeeMaker coffee;
    private DishWasher dishWasher;
    private Refrigerator fridge;

    public SmartKitchen() {
        coffee = new CoffeeMaker();
        fridge = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getCoffee() {
        return coffee;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag){
        coffee.setHasWorkToDo(coffeFlag);
        fridge.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        coffee.brewCoffee();
        fridge.orderFood();
        dishWasher.doDishes();
    }
}
