package OOP.access;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        Subclass obj = new Subclass(20, "Chaitanya");
        int n = obj.num; // Accessing protected field from subclass
       
    }
}

class SubsubClass extends Subclass {
    public SubsubClass(int num, String name) {
        super(num, name);
    }
    
    public static void main(String[] args) {
        SubsubClass obj = new SubsubClass(30, "Chaitanya");
        int n = obj.num; // Accessing protected field from subclass of subclass
    }
}

class Subclass2 extends A {
    public Subclass2(int num, String name) {
        super(num, name);
    }
    
    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(40, "Chaitanya");
  //      int n = obj.num; 
    }
}
