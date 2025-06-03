public class searchinrange {
    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 89, 32, 99, 7, 65, 34, 12};
        int target = 32;
        System.out.println("Element found at index: " + SearchInRange(arr, target, 2, 5));

    }
    static int SearchInRange(int [] arr,int target,int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<=end;index++){
            int element=arr[index];
            if(element==target){
                return index; 
            }
            
        }
        return -1;
    }
}
