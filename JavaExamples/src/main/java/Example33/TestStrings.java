package Example33;

public class TestStrings {

    public static void main(String[] args) {

        String a = "Bocchi";

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        /** Don't do this if your intention is to check for identical string*/
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false, since s3 is not interned
        System.out.println(s1 == "hello"); // true

        /** Always use the equals method */
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals("hello")); // true

    }
}
