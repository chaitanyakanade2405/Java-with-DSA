import java.util.Scanner;
import java.util.Arrays;
public class array1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(arr[2]);

        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<5;i++){
        //     System.out.println(arr[i]);
        // }

        for (int num:arr) {
            System.out.println(num + "  ");
        }
        in.close();
    }
}
