package Example35;

public class SiberianHusky implements Dog{

    private String name;

    SiberianHusky(){
        name = "Mr Husky";
    }

    @Override
    public void makeSound() {
        System.out.println(name + " howls!");
    }

    @Override
    public void wagTail() {
        System.out.println(name + " wags tail excitedly!");
    }
}
