
//condition: Find the largest element in the array that is less than or equal to the target value.
// This is known as the "floor" of the target value in the array.
public class floor {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 34, 46, 58, 69, 78, 89, 99 };
        int target = 54;
        System.out.print(floor1(arr, target));
    }

    static int floor1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}

