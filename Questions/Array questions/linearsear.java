public class linearsear {
    public static void main(String[] args) {
        int [] arr ={1,5,8,3,9};
        int target = 9;
        int result = linsear(arr,target);
        System.out.println("Target is at index: " + result);
    }

    static int linsear(int [] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
