import java.util.Arrays;

public class search2daarr {
    public static void main(String[] args) {
        int arr[][] = {
            {23, 45, 67, 89},
            {32, 65},
            {34, 12, 56, 78}
        };
        int target=78;
        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));
        
    }
    static int[] search(int [][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row, col}; // Return the row and column indices
                }
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if target is not found
    }
}
