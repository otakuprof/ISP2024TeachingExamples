package Example34;

public abstract class GeometricObjectMod {
    private String colour;
    private boolean filled;

    GeometricObjectMod(){
        colour = "white";
        filled = false;
    }

    GeometricObjectMod(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }
}
