//Richest Customer Wealth LeetCode Problem #1672
package Questions;
public class maxwealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        System.out.println(maximumWealth(accounts)); // Call the maximumWealth function and print the result
    }
    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
        int sum=0;
        for(int account=0;account< accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
