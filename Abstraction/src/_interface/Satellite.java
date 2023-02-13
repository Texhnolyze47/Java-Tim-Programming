package _interface;

public class Satellite implements OrbitEarth{

    FlightStages  stages = FlightStages.GROUNDED;
    @Override
    public void archiveOrbit() {
        transition("Orbit achieved!");
    }

    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        archiveOrbit();
        transition("Data Collection while orbiting");
    }

    public void transition(String description){
        System.out.println(description);
        stages = transition(stages);
        stages.track();
    }
}
