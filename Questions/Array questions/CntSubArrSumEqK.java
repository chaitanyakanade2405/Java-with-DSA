// Subarray Sum Equals K LeetCode Problem #560
public class CntSubArrSumEqK {
 public static void main(String[] args) {
        int [] arr = {1,1,1};
        int k = 2;
        System.out.println(cntSubarr(arr, k));

    }

    static int cntSubarr(int [] arr,int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum==k) {
                    count++;
                }
            }

        }
        return count;
    }
}