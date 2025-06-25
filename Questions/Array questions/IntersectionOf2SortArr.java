public class IntersectionOf2SortArr {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 5, 6, 7, 8};
        int n = arr1.length;
        int m = arr2.length;
        System.out.print("Intersection of the two sorted arrays is: ");
        intersection(arr1, arr2, n, m);
    }

    //2 pointer approach
    static void intersection(int arr1[], int arr2[], int n, int m){
        int i=0,j=0;
        while (i<n && j<m) {
            if(arr1[i] < arr2[j]){
                i++;
            } else if(arr1[i] > arr2[j]){
                j++;
            } else {
                //found common element
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            
        }
    }
}
