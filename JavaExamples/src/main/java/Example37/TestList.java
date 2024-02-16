package Example37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestList {

    public static String ARRAYLIST = "ArrayList";
    public static String LINKEDLIST = "LinkedList";
    public static String VECTOR = "Vector";

    public static void main(String[] args) {

        String choice = "ArrayList";
        List<Integer> integerList = null;

        // Write if/else statements to instantiate integerList based on choice
        if( choice.equals("ArrayList")){
            integerList = new ArrayList<>();
        }else if( choice.equals("LinkedList")){
            integerList = new LinkedList<>();
        }else{
            integerList = new Vector<>();  // not the Maths vector
        }

        System.out.println("List:" + (integerList instanceof List) );
        System.out.println("ArrayList:" + (integerList instanceof ArrayList) );

        //List<> Interface has an add method, so regardless
        // of the choice of object, I have the guarantee that I can
        // call it
        System.out.println("List is empty: " + integerList);
        integerList.add( Integer.valueOf("123"));
        integerList.add( Integer.valueOf("456"));
        System.out.println(integerList);

        // OK
        ArrayList<Integer> list1 = new ArrayList<>();
        // BETTER
        List<Integer> list2 = new ArrayList<>();

    }
}