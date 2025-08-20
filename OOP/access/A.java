package OOP.access;

public class A {
    protected int num; // Protected field, accessible in subclasses and same package
    //private int num;
    String name;
    int [] arr;

    public int getNum() { // Public method to access private field
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }

    public A(int num2, String name2) {
        //TODO Auto-generated constructor stub
    }
}


