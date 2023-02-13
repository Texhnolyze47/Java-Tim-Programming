package _interface.exercise;

public interface Mappable{
    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    static void maplt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }
    default String toJson(){
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    String getLabel();

    String getMarker();

    Geometry getShape();

}
