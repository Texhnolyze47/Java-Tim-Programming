package exercises.point;

public class Main {

    public static void main(String[] args) {
        Point firsPoint = new Point(6,5);
        Point secondPoint = new Point(3,1);
        System.out.println("distance (0,0) " + firsPoint.distance());
        System.out.println("distance (second) " + firsPoint.distance(secondPoint));
        System.out.println("distance (2,2) " + firsPoint.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
}
