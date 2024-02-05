package Example34;

public class Circle extends GeometricObjectMod {

    private double radius;

    Circle( double radius){
        // by default the no-arg constructor is called
        super(); // JVM will put this for you if you don't
        this.radius = radius;
    }
    /*** IT IS ALWAYS GOOD PRACTICE TO CALL super() explictly */
    Circle( String colour, boolean filled, double radius){
        super(colour, filled);
        this.radius = radius;
    }
    // Now, provide an implementation of the abstract methods so
    // that you can instantiate a Circle object
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2.0;
    }
}
