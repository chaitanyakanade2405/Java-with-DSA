public class passingvalue {
    public static void main(String[] args) {
        String name = "Alice";
        changename(name);
        System.out.println(name); // This will still print "Alice" because the original string is unchanged
    }
    static void changename(String name) {
        name = "John"; // This change will not affect the original string outside this method 
                       //as strings are immutable in Java and java is pass-by-value
    }
}
