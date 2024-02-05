package AnimalExample;

public abstract class Animal {
    // you can specify the usual things in a Concrete class
    // Concrete class - a class that can be instantiated
    // these are inherited by the subclasses and can be reused
    private String name;

    Animal(){
        this.name = "Bond";
    }

    Animal(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("running");
    }

    public abstract void makeSound();
    // I want to force all my subclasses to
    // provide their own implementation of makeSound()
    // I am not giving it to them (because I can't)
}

class Cat extends Animal{
    // If Cat wants to be a subclass of Animal
    // Cat must have an implementation of makeSound();
    public void makeSound(){
        System.out.println("Meow");
    }
}

class Cow extends Animal{
    public void makeSound(){
        System.out.println("Moo");
    }
}
