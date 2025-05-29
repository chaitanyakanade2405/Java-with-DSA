public class shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 20; // This x shadows the static variable x
        System.out.println(x);
        fun(); // Calls the static method which refers to the static variable x
        }
    static void fun() {
        System.out.println(x); // This will refer to the static variable x
    }
}
