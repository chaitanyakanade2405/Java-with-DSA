public class binarysearch {
    public static void main(String[] args) {
        int [] arr={2,4,34,46,58,69,78,89,99};
        int target=89;
        System.out.println(binarySearch(arr, target)); 
    }
    static  int binarySearch(int [] arr,int target) {
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start) / 2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
      }
        return -1;
   }
}
