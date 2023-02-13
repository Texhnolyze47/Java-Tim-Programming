package _interface;

public class Test {

    public static void main(String[] args) {
        imFlight(new Jet());
//        OrbitEarth.log("Testing " + new  Satellite());
        orbit(new Satellite());
    }
    private static void imFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof  Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier){
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
