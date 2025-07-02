import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {100, 4, 200, 1, 3, 2,101,200,102,103,104,105,106,107,108,109,110};
        int result = longestSequence(arr);
        System.out.println("Length of the longest consecutive sequence is: " + result);
    }

    // Optimal approach using HashSet
    static int longestSequence(int [] arr){
        if(arr.length == 0) return 0;
        int longest = 1;
        Set <Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for(int it : set){
            if(!set.contains(it - 1)){
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest , cnt);
            }
        }
        return longest;
    }

    // Better approach using sorting
    // static int longestSequence(int [] arr){
    //     if(arr.length == 0) return 0;
    //     int longest = 1;
    //     Arrays.sort(arr);
    //     int cnt = 0;
    //     lastSmallest = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] -1 == lastSmallest){
    //             cnt++;
    //         } else if(arr[i] != lastSmallest){
    //             cnt = 1;
    //         }
    //         lastSmallest = arr[i];
    //         longest = Math.max(longest, cnt);
    //     }
    //     return longest;
    // }

}
