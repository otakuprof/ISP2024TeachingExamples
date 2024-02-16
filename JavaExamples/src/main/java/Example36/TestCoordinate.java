package Example36;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCoordinate {

    public static void main(String[] args) {

        Coordinate c1 = new Coordinate(5, 12);
        Coordinate c2 = new Coordinate(3, 4);
        Coordinate c3 = new Coordinate(7, 24);
        Coordinate c4 = new Coordinate();

        List<Coordinate> coordinateList = new ArrayList<>();
        coordinateList.add(c1);
        coordinateList.add(c2);
        coordinateList.add(c3);
        coordinateList.add(c4);
        System.out.println(coordinateList);

        // Pass coordinateList to Collections.sort()
        // Sorts by the Comparable interface, compareTo method
        //Collections.sort( coordinateList ); // sorts in-place
        // Sorts according to the rule specified in CoordinateComparator()
        Collections.sort( coordinateList, new CoordinateComparator());
        // then display the outcome
        System.out.println("Sorted List:");
        System.out.println(coordinateList);

    }
}
