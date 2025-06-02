public class max {
    public static void main(String[] args) {
        int[] arr={1, 2, 99,3, 4, 5, 69};
        System.out.println(max1(arr));
    } 
    static int max1(int[] arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
