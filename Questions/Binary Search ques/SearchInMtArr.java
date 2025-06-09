public class SearchInMtArr {
    public static void main(String[] args) {
        
    }
    static int search(int [] arr,int target){
    int peak=peakIndexinMountainArray(arr);
    int firsttry=OrderAgnosticbs(arr,target,0,peak);
    if(firsttry != -1){
        return firsttry;
    }
    return OrderAgnosticbs(arr,target,peak+1,arr.length-1);
    }

    static int peakIndexinMountainArray(int[] arr) {
        int start=0;
        int end =arr.length-1;

        while(start<end){
            int mid=start +(end-start) / 2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    
    static int OrderAgnosticbs(int[] arr, int target, int start, int end) {
        boolean isASc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isASc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
         return -1;
    }
}
