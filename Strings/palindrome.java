package Strings;
public class palindrome {
    public static void main(String[] args) {
        String str ="abcba";
        System.out.println(isPalindrome(str)); // Test with an empty string
    }
    static boolean isPalindrome(String str){
        if (str == null || str.length() == 0) { // Check for null or empty string
            return true; // An empty string is considered a palindrome
        }
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        for (int i = 0; i <str.length() / 2;i++) {
            char start = str.charAt(i); 
            char end = str.charAt(str.length() - i - 1);
            if (start != end) { 
                return false;
            }
        }
        return true;
    }
}
