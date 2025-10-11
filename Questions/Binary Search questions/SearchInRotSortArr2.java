public class SearchInRotSortArr2 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
    static boolean search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return true;

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Left side sorted
            else if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            // Right side sorted
            else {
                if (arr[mid] < target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return false;
    }
}
