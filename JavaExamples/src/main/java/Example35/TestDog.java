package Example35;

public class TestDog {

    public static void main(String[] args) {
        // Interface can act as a supertype;
        Dog a = new WelshCorgi();
        // guarantee that a can executed methods defined in Dog
        // if i change the object to WelshCorgi()
        // code below still works, don't need to change!
        a.makeSound();
        a.wagTail();

        String choice = "Corgi";
        Dog b;
        // I promise that b can execute the methods in the Dog interface
        // polymorphism: I promise that I can assign any object that implements Dog to b
        if( choice.equals("Corgi")){
            b = new WelshCorgi();
        }else{
            b = new SiberianHusky();
        }
        // Program to interfaces
        // I can assign any object to b,
        // as long as it implements Dog

    }
}
