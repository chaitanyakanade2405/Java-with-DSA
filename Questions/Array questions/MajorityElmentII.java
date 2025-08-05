//MajorityElmentII Leetcode Problem #229
import java.util.ArrayList;
import java.util.List;

public class MajorityElmentII {
    public static void main(String[] args) {
        int [] arr = {1,2};
        List<Integer> ans = majorityElement(arr);
        System.out.println(ans);
    }

    static List<Integer> majorityElement(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i = 0;i <arr.length;i++){
            if(count1 == 0 && arr[i] != ele2){
                count1 = 1;
                ele1 = arr[i];
            }
            else if(count2 == 0 && arr[i] != ele1){
                count2 = 1;
                ele2 = arr[i];
            }
            else if (arr[i] == ele1) count1 ++;
            else if (arr[i] == ele2) count2 ++;
            else{
                count1 --;
                count2 --;
            }
        }
    List<Integer> ans = new ArrayList <>();
        count1 = 0;
        count2 = 0;
        for(int i = 0;i < arr.length;i++){
           if (arr[i] == ele1) count1 ++;
           if (arr[i] == ele2) count2 ++;
        }
        int mini = (int)(arr.length / 3)+1;
         if (count1 >= mini) ans.add(ele1);
        if (count2 >= mini) ans.add(ele2);
    return ans;
    }
}
