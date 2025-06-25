import java.util.ArrayList;

public class UnionOf2SortArr {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 5,6, 7, 8};
        int n = arr1.length;
        int m = arr2.length; 
        ArrayList<Integer> union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of the two sorted arrays is: " + union);   
    }

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[],int n, int m) {
        int i=0, j=0;
        ArrayList<Integer> Union = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]) 
                    Union.add(arr1[i]);
                i++;
            } else {
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]) 
                    Union.add(arr2[j]);
                j++;
            }
        }
        while(i<n){
            if(Union.size()==0 || Union.get(Union.size()-1) != arr1[i]) 
                Union.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(Union.size()==0 || Union.get(Union.size()-1) != arr2[j]) 
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}

