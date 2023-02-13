package _interface.exercise;

public class UtilityLine implements Mappable{
    private String name;
    private UtilityType utilityType;

    public UtilityLine(String name, UtilityType utilityType) {
        this.name = name;
        this.utilityType = utilityType;
    }

    @Override
    public String getLabel() {
        return name + "(" + utilityType + ")" ;
    }
    @Override
    public String getMarker() {
        return switch (utilityType){
            case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarkers.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarkers.SOLID;
            case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
            default -> Color.BLACK + " " + LineMarkers.SOLID;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "utility": "%s"
                """.formatted(name,utilityType);
    }
}
