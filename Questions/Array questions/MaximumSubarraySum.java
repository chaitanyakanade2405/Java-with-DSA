// Maximum Subarray Sum using Kadane's Algorithm LeetCode Problem #53
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        long result = maxSubarray(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }

    static long maxSubarray(int [] arr){
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > maxi){
                maxi=sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
