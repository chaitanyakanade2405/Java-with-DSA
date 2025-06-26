//Single Number Leetcode Problem #136
public class FindNumAppOnce {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1}; // Example array with one number appearing once
        System.out.println("Number that appears once is: " + findNumOnce(arr));
    }
    static int findNumOnce(int [] arr){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
