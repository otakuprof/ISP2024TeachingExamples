package Example34;

public class TestCircle {

    public static void main(String[] args) {


        GeometricObjectMod c = new Circle(10);
        System.out.println( c.getColour()); // inherited from GeometricObjectMod
        System.out.println( c.getArea() ); // implemented in Circle concrete class
        /** Abstract class 
         * (1) provides guarantees that its child classes will implement its abstract methods
         * (2) shares common implementation of methods with its child classes
         */
    }
}
