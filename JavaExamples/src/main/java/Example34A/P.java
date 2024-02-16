package Example34A;

public abstract class P {

    private String name;

    public P(){
        name = "Pikachu";
    }

    public P(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayAction();
}
