//Find Numbers with Even Number of Digits LeetCode Problem #1295
public class evendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(isEven(num)){
                count++;
            }
        }
        return count; // Return the count of numbers with even digits
    }
    static boolean isEven(int num) {
        return digits(num) % 2 == 0; // Check if the number of digits is even
    }
    static int digits(int num) {
        if(num < 0) {
            num = -num; // Convert negative numbers to positive
        }
        if(num == 0) {
            return 1; // Special case for zero, which has one digit
        }
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count; // Return the number of digits in the number
    }
    static int digits2(int num) {
        if(num < 0) {
            num = -num; // Convert negative numbers to positive
        }
        return (int) Math.log10(num) + 1; // Use logarithm to calculate the number of digits
    }
}
