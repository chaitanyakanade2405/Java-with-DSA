// Buy and Sell Stock Problem LeetCode Problem #121
public class BuyAndSellStock {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int result = MaxProfit(arr);
        System.out.println("Maximum Profit: " + result);
    }

    static int MaxProfit(int[] arr){
        int MaxProfit = 0;
        int MinPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            MinPrice = Math.min(MinPrice,arr[i]);
            MaxProfit = Math.max(MaxProfit, arr[i]-MinPrice);
        }
        return MaxProfit;
    }
}
