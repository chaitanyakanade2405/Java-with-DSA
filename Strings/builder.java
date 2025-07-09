package Strings;
public class builder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sc.append(ch); // Appending characters 'a' to 'z' to the StringBuilder
        }
        System.out.println(sc); // Prints the complete string after appending
    }
}
