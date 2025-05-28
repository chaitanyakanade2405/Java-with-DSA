import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int [] arr = {1,2,46,78,90};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0] = 99; // Changing the first element of the array
        // Note: Arrays are reference types in Java, so changes will reflect outside this method
    }
}
