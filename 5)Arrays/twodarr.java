import java.util.Arrays;
import java.util.Scanner;
public class twodarr {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // // Print the 2D array
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // Number of rows

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        for(int[] a: arr){
                System.out.println(Arrays.toString(a));
            }
        sc.close();
    }
}
