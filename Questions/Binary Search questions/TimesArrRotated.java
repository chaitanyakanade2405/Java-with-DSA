public class TimesArrRotated {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] <= arr[end]) {
                if(arr[start] <  ans) {
                    index = start;
                    ans = arr[start];
                }
                break;
            }
            if (arr[start] <= arr[mid]) {
                if(arr[start] <  ans) {
                    index = start;
                    ans = arr[start];
                }
                start = mid + 1;
            } else {
                end = mid - 1;
                if(arr[mid] <  ans) {
                    index = mid;
                    ans = arr[mid];
                }
            }
        }
        return index;
    }
}
