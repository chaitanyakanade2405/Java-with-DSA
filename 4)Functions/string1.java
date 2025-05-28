public class string1 {
    public static void main(String[] args) {
        greet();
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String greeting = "Hello, World!";
        return greeting;
    }
}
