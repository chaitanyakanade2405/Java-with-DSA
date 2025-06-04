public class max2darr {
    public static void main(String[] args) {
        int[][]arr={
            {23, 45, 67, 89},
            {32, 65},
            {34, 12, 56, 78}
        };
        System.out.println(max(arr)); // Call the max function and print the result
    }
    static int max(int[][] arr) {
        int max=Integer.MIN_VALUE; // Initialize max to the smallest possible integer
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] > max){
                    max = arr[row][col]; // Update max if a larger value is found
                }
            }
        }
        return max; // Return the maximum value found in the 2D array
    }
}
