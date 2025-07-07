package Strings;
public class comparison {
    public static void main(String[] args) {
        String a = "Chaitanya";
        String b = "Chaitanya";
        System.out.println(a == b); // true, because both refer to the same string literal in the string pool

        String name1 = new String("Chaitanya");
        String name2 = new String("Chaitanya");
        //System.out.println(name1 == name2); // false, because they are different objects in memory
        System.out.println(name1.equals(name2)); // true, because equals() compares the content of the strings
        System.out.println(name1.charAt(0)); // prints 'C', the first character of the string
    }

}
