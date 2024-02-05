package AnimalExample;

public class TestAnimal {

    public static void main(String[] args) {

        //Animal animal = new Animal(); // you cannot instantiate an abstract class

        //BUT, polymorphism, you can declare Animal as a supertype!
        Animal a = new Cat();
        Animal b = new Cow();
        a.makeSound();
    }
}
