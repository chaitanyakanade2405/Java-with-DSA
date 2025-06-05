public class orderagnosticbs {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 34, 46, 58, 69, 78, 89, 99 };
        int target = 89;
        System.out.println(OrderAgnosticbs(arr, target));
    }

    static int OrderAgnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isASc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isASc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
         return -1;
    }
}
