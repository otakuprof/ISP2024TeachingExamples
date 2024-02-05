package Example30;

public class TestOrange {

    public static void main(String[] args) {

        /** TODO 1. Write code to get the string "Oranges have Vitamin C". */
        System.out.println( Orange.getFact() ); // static --> new not needed

        /** TODO 2. Write code to instantiate an Orange object,
         * and execute getType() to get the string "Navel Orange"  */
        Orange orange;  // declare variable only!
        orange = new Orange(); // instantiation
        System.out.println( orange.getType() );

        /** TODO 3. Write code to instantiate an Orange object,
         *  and execute getType() to get the string "Tangerine"
         */
        Orange anya = new Orange("Tangerine");
        System.out.println(anya.getType());
    }
}
