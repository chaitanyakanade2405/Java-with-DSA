import java.util.Arrays;

public class leftrotatearrbydplace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateBydplace(arr, k);
        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }

    static void rotateBydplace(int[]arr,int d){
        if(arr.length==0) return;
        d = d % arr.length;
         int[] temp = Arrays.copyOfRange(arr, 0, d);

        for(int i = d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }

        for(int i = arr.length - d;i<arr.length;i++){
            arr[i] = temp[i-(arr.length-d)];
        }
    }
}
