public class LargestElementArr{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int largest = largeElement(arr, n);
        System.out.println("Largest element in the array is: " + largest);
    }
    static int largeElement(int arr[], int n){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        return largest;
    }

}