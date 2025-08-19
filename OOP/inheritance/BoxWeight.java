package OOP.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1; 
        
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // Call the parent class constructor //used to intialise values present in parent class
        this.weight = weight;
    }
}
