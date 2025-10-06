package Revision;
public class seclararr {
    public static void main(String[] args) {
        int [] arr = {2,7,9,4,3,9};
         int secondLargest = seclar(arr);
         System.out.println(secondLargest);
    }

    static int seclar(int [] arr){
        if(arr.length < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }else if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
        return second_largest == Integer.MIN_VALUE ? -1:second_largest;
    }
}
