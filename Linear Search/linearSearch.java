
public class linearSearch {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,32,99,7,65,34,12};
        int target=65;
        int ans=linearsearch(arr,target);
        System.out.println("Element found at index: " + ans);
    }
    static int linearsearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index; 
            }
            
        }
        return -1;
    }
}
