public class upperBound {
     public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;
        int ind = upperB(arr, x);
        System.out.println("The upper bound is the index: " + ind);
    }

    static int upperB(int [] arr, int x){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end-start) / 2;
            if(x < arr[mid]){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
