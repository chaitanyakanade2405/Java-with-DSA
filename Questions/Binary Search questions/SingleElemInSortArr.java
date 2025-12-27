public class SingleElemInSortArr {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int ans = singleNonDuplicate(arr);
        System.out.println("The single non-duplicate element is: " + ans);
    }

    static int singleNonDuplicate(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[arr.length - 1] != arr[arr.length - 2])
            return arr[arr.length - 1];

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || arr[mid] != arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] != arr[mid + 1])) {
                return arr[mid];
            }

            if ((mid % 2 == 1 && arr[mid - 1] == arr[mid]) || 
            (mid % 2 == 0 && arr[mid + 1] == arr[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
