public class SecondLargestElementArr {
    public static void main(String[] args) {
        int arr[] = {4,2,5,1,3};
        int n = arr.length;
        int secondLargest = secondLargestElement(arr, n);
        if (secondLargest != -1) {
            System.out.println("Second largest element in the array is: " + secondLargest);
        } else {
            System.out.println("Array does not have a second largest element.");
        }
        int secondSmallest = secondSmallestElement(arr, n);
        System.out.println("Second smallest element in the array is: " + secondSmallest);
    }
    static int secondLargestElement(int arr[], int n) {
        if (n < 2) {
            return -1; // Not enough elements for a second largest
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    static int secondSmallestElement(int arr[], int n) {
        if (n < 2) {
            return -1; // Not enough elements for a second smallest
        }
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
    }
}
