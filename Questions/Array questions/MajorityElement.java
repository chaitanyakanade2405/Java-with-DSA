// Majority Element in an array LeetCode Problem #169
public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};
        int result = majorElement(arr);
        System.out.println("Majority Element: " + result);
    }

     static int majorElement(int [] arr){
        int count = 0;
        int element = 0;

        for (int i = 0; i < arr.length; i++) {
            if(count == 0){
                count = 1;
                element = arr[i];
            }else if(element == arr[i]) count++;
            else count --;
        }
        int count1 = 0;
         for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element) count1++;
         }   
         if (count1 > (arr.length / 2)) return element;
            return -1;
     }
}
