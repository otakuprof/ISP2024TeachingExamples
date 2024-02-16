package Example36;

import java.util.Comparator;

// WHat if you want to sort by other means?
// WRITE A SEPARATE CLASS THHAT IMPLMENTS THE Comparator
public class CoordinateComparator implements Comparator<Coordinate> {
    @Override
    public int compare(Coordinate coordinate, Coordinate other) {
        // return a positive number if coordinate is > other
        // DECISION: sort by x-coordinate
        if( coordinate.getX() > other.getX() ){
            return 1;
        }else if( coordinate.getX() == other.getX() ){
            return 0;
        }else{
            return -1;
        }

    }
}
