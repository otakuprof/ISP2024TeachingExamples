package Example34A;

public class Q extends P{

    public static void main(String[] args) {
        P p = new Q("Gojo");
        p.displayAction();
    }

    Q(){} // by default super() is called

    Q(String name){
        super(name); // Call P(String name)
    }
    //no access modifier ==> package-private ==> weaker
    // than public
    public void displayAction(){
        System.out.println( getName() + " is running");
    }

}
