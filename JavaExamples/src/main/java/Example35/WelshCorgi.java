package Example35;

public class WelshCorgi implements Dog {

    private String name;

    WelshCorgi(){
        this.name = "Norman";
    }
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    @Override
    public void wagTail() {
        System.out.println(name + " wagging a tail");
    }
}

