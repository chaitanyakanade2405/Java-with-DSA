//Check if Array Is Sorted and Rotated Leetcode Problem #1752
public class CheckArrSort {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5}, n = 5;

    System.out.println(isSorted(arr, n));
         int arr2[] = {3, 4, 5, 1, 2};
         System.out.println(rotatedSort(arr2));
    }
    static boolean isSorted(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
        return false;
    }

    return true;
  }
  // if rotated sorted array
    static boolean rotatedSort(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}


