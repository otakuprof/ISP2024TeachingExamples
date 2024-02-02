package Example30;

public class Orange {

    public static String getFact(){
        return "Oranges have Vitamin C";
    }

    private String type;

    Orange(){
        this.type = "Navel Orange";
    }

    Orange(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
