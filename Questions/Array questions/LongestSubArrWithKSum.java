public class LongestSubArrWithKSum {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int n = a.length;
        System.out.println("Length of longest subarray with sum " + k + " is: " + longestSubArr(a, n, k));
    }

    static int longestSubArr(int []arr,int n,long k){
        int right=0;
        int left=0;
        long sum=arr[0];
        int maxLen=0;

        while(right<n){
            while (left <= right && sum>k) {
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right<n) sum += arr[right];
        }
        return maxLen;
    }
}