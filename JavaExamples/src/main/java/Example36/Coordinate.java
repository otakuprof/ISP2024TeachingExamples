package Example36;

//*** Comparable<T> - T, the class that you are comparing to, i.e. yourself
public class Coordinate implements Comparable<Coordinate> {

    private double x, y;

    Coordinate(){}

    Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(){
        return Math.sqrt( x*x + y*y);
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        String template = "(%f, %f)";
        return String.format( template, x, y);
    }

    // This method is from the Comparable Interface
    @Override
    public int compareTo( Coordinate other){
        // return a positive number if this > other
        // DECISION: sort by distance from origin
        // ==> this.getDistance() > other.getDistance() --> return a positive number
        if( getDistance() > other.getDistance() ){
            // this is ordered higher than other
            return 1;
        }else if( getDistance() == other.getDistance()){
            // this is same position as other
            return 0;
        }else{
            // this is ordered lower that other
            return -1;
        }
    }

}
