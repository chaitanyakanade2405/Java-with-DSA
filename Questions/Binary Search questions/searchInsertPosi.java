// Search Insert Position Leetcode Problem #35
public class searchInsertPosi {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }

     static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end-start) / 2;
            if(target <= arr[mid]){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
