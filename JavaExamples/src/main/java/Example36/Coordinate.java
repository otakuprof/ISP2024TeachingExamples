package Example36;

public class Coordinate  {

    private double x, y;

    Coordinate(){}

    Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(){
        return Math.sqrt( x*x + y*y);
    }

    @Override
    public String toString() {
        String template = "(%f, %f)";
        return String.format( template, x, y);
    }

}
