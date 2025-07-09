package Strings;
import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // Character addition
        System.out.println("a" + "b"); // String concatenation
        System.out.println("a" + 1); // String concatenation with integer
        System.out.println('a' + 1); // Character addition with integer
        System.out.println((char)('a' + 1)); // Character addition with type casting
        System.out.println("Chaitanya"+new ArrayList<>()); // String concatenation with ArrayList
        System.out.println("Chaitanya" + Integer.valueOf(24)); // String concatenation with Integer object
        System.out.println(Integer.valueOf(24) + "" + new ArrayList<>());// Integer to String concatenation with ArrayList
    }
}
