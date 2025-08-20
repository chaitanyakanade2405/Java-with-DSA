package OOP.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Chaitanya", new int[]{1, 2, 3});
        obj.getNum(); // Accessing private field through public method
        int n = obj.num; //no error because num is protected and accessible in the same package
    }
}