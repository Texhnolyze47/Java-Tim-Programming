package exercises.room;

public class Bedroom {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private String name;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall2, Wall wall3, Wall wall4,
                   Wall wall1, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.wall1 = wall1;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
    }

}
