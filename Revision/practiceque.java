package Revision;
public class practiceque {
    public static void main(String[] args) {
        
    }

    //sum of 2 array
    // static int[] summofarr(int[]arr1,int[]arr2){
    //     int n = Math.min(arr1.length, arr2.length);
    //     int[] res = new int[n];
    //     for(int i = 0 ;i<n;i++){
    //         res[i]=arr1[i]+arr2[i];
    //     }
    //     return res;
    // }

    //count in prime
    // static int countt(int [] arr){
    //     int count = 0;
    //     for(int x:arr){
    //         if (isPrimeee(x)) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // private boolean isPrimeee(int n){
    //     if(n<= 1) return false;

    //     for (int i = 2; i < n; i++) {
    //         if(n%i==0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //increase subarray
    // static int longestsubarrcont(int [] arr){
    //     int longest = 1,curr=1;

    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]>arr[i-1]){
    //             curr++;
    //             longest = Math.max(longest,curr);
    //         }else{
    //             curr=1;
    //         }
    //     }
    //     return longest;
    // }

    // //palindrome
    // static boolean ispalii(String str){
    //     if(str==null || str.length() ==0){
    //         return true;
    //     }
    //     str=str.toLowerCase();
    //     for(int i=0;i<str.length() / 2;i++){
    //         char start = str.charAt(i);
    //         char end = str.charAt(str.length()-i-1);
    //         if(start != end){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}