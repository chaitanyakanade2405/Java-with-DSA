package OOP.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.area(); // Calls Shapes' area method
        circle.area(); // Calls Circle's area method
        triangle.area(); // Calls Triangle's area method
        square.area(); // Calls Square's area method
    }
}
