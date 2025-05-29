public class overloading {
 public static void main(String[] args) {
    fun("Chaitanya"); 
}
static void fun(int x) {
        System.out.println(x);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
