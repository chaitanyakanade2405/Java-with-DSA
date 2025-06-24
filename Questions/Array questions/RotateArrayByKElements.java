//Rotate Array LeetCode Problem #189
public class RotateArrayByKElements {
public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        RotateArrayRight(arr, k, n);
        System.out.print("Right Rotated: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reset array for left rotation example
        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        RotateArrayLeft(arr, k, n);
        System.out.print("Left Rotated: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Right rotation by k elements
    static void RotateArrayRight(int[] arr, int k, int n) {
        k = k % n;
        ReverseArray(arr, 0, n - 1);
        ReverseArray(arr, 0, k - 1);
        ReverseArray(arr, k, n - 1);
    }
    // Left rotation by k elements
    static void RotateArrayLeft(int[] arr, int k, int n) {
        k = k % n;
        ReverseArray(arr, 0, k - 1);
        ReverseArray(arr, k, n - 1);
        ReverseArray(arr, 0, n - 1);
    }
    static void ReverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
    