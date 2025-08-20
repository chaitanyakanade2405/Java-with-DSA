package OOP.access;

public class ObjDemo {
    int num;
    float gpa;

    public ObjDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjDemo) obj).num;
    }
    public static void main(String[] args) {
        ObjDemo obj1 = new ObjDemo(10, 3.5f);
        ObjDemo obj2 = new ObjDemo(10, 3.8f);

        if (obj1.equals(obj2)) {
            System.out.println("Objects are equal");
        }
        //System.out.println(obj1.hashCode());
        //System.out.println(obj2.hashCode());
    }
}
