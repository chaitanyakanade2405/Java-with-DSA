//Peak Index in a Mountain Array LeetCode Problem #852
public class PeakIndexInMtArr {
    public static void main(String[] args) {
        int[] arr = {0,23,45,67,75,32,30,12,5,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
        static int peakIndexInMountainArray(int[] arr) {
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
    }