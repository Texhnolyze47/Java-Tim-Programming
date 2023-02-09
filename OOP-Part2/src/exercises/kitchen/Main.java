package exercises.kitchen;

public class Main {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getFridge().setHasWorkToDo(true);
//        kitchen.getCoffee().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getFridge().orderFood();
//        kitchen.getCoffee().brewCoffee();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}
