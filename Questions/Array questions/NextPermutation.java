// Next Permutation Leetcode problem #31
public class NextPermutation{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 6, 5, 4};
        nextPermutation(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        
    }

   static void nextPermutation(int[] arr) {
    int n = arr.length;
    int index = -1;

    // Step 1: Find the first decreasing element from the end
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            index = i;
            break;
        }
    }

    // Step 2: If no such index, reverse the whole array
    if (index == -1) {
        reverse(arr, 0, n - 1);
        return;
    }

    // Step 3: Find the next greater element from the right side
    for (int i = n - 1; i > index; i--) {
        if (arr[i] > arr[index]) {
            swap(arr, i, index);
            break;
        }
    }

    // Step 4: Reverse the part after the swapped index
    reverse(arr, index + 1, n - 1);
}

static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        swap(arr, start, end);
        start++;
        end--;
    }
}

static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}


    // List method to find the next greater permutation of a list of integers.
    // static List< Integer > nextGreaterPermutation(List< Integer > A) {
    //     int n = A.size(); // size of the array.

    //     // Step 1: Find the break point:
    //     int ind = -1; // break point
    //     for (int i = n - 2; i >= 0; i--) {
    //         if (A.get(i) < A.get(i + 1)) {
    //             // index i is the break point
    //             ind = i;
    //             break;
    //         }
    //     }

    //     // If break point does not exist:
    //     if (ind == -1) {
    //         // reverse the whole array:
    //         Collections.reverse(A);
    //         return A;
    //     }

    //     // Step 2: Find the next greater element
    //     //         and swap it with arr[ind]:

    //     for (int i = n - 1; i > ind; i--) {
    //         if (A.get(i) > A.get(ind)) {
    //             int tmp = A.get(i);
    //             A.set(i, A.get(ind));
    //             A.set(ind, tmp);
    //             break;
    //         }
    //     }

    //     // Step 3: reverse the right half:
    //     List<Integer> sublist = A.subList(ind + 1, n);
    //     Collections.reverse(sublist);

    //     return A;
    // }
}