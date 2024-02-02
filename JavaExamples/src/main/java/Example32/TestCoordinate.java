package Example32;

public class TestCoordinate {

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(1, 3);
        Coordinate c2 = new Coordinate(1, 3 );
        System.out.println(c1.equals(c2)); // True
        System.out.println(c1);
    }
}
