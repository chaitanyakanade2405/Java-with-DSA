package OOP.polymorphism;

public class Numbers {
    double sum(double a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    double sum(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(5.5, 10)); // Calls the first sum method
    }
}
