public class MinRotSortArr {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Left sorted
            if (arr[start] <= arr[mid]) {
                ans = Math.min(ans, arr[start]);
                start = mid + 1;
            }
            // Right sorted
            else {
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}
