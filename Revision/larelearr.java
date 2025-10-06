package Revision;
import java.util.Arrays;

public class larelearr {
    public static void main(String[] args) {
        int [] arr ={2,15,6,4,24,5,1};
        System.out.println("Largest element is:");
        largestelement1(arr);
    }

    static void largestelement1(int [] arr){
        Arrays.sort(arr);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
