package OOP.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){               //constructor
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.w= side;
        this.h = side;
        this.l = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){       //copy constructor
        this.l = old.l; 
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box class");
    }

}
