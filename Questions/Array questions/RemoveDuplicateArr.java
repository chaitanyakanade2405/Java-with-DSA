//Remove Duplicates from Sorted Array Leetcode Problem #26
public class RemoveDuplicateArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        int newSize = removeDuplicate(arr);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicate(int [] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return (i+1);
    }
}
