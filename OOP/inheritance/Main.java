package OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box(4.4,5.6,8.9); // Default constructor
        // Box box2 = new Box(box1); // Copy constructor
        // System.out.println(box2.l + " " + box2.h + " " + box2.w );

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h + " " + box3.weight);

        BoxWeight box4 = new BoxWeight(4.4, 5.6, 8.9, 10.5); 
        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        // BoxWeight box5 = new Box(2,3,4);
        // System.out.println(box5.l);

    }

    
}
