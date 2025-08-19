// Maximum Product Subarray Leetcode Problem #152
public class MaxProdSubArr {
    public static void main(String[] args) {
        int [] arr = {1, -2, -3, 0, 7, -8, -2};
        int maxProduct = maxProduct(arr);
        System.out.println("Maximum product of a subarray is: " + maxProduct);
    }

    static int maxProduct(int[] arr) {
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(prefix == 0) prefix=1;
            if(suffix == 0) suffix=1;
            prefix *= arr[i];
            suffix *= arr[arr.length-i-1];
            ans= Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}
