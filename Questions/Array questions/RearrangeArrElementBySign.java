// Rearrange Array Elements by Sign LeetCode Problem #2149
public class RearrangeArrElementBySign {
    public static void main(String[] args) {
        int [] arr ={3, -2, 1, -5, 4, -3, 2, 6, -1};
        int [] result = RearrangeSign(arr);
        System.out.print("Rearranged Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static int [] RearrangeSign(int [] arr){
        int n = arr.length;
        int[] ans = new int[n];
         int posiIndex = 0;
         int negiIndex = 1;

         for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[negiIndex]=arr[i];
                negiIndex += 2;
            }else{
                ans[posiIndex]=arr[i];
                posiIndex += 2;
            }
         }
         return ans;
    }

// Array List Method
//   static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A){
//     int n = A.size();
//      ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
//     int posiIndex = 0;
//     int negiIndex = 1;

//     for (int i = 0; i < n; i++) {
//         if (A.get(i) < 0) {
//             ans.set(negiIndex, A.get(i));
//             negiIndex += 2;
//         }else{
//             ans.set(posiIndex, A.get(i));
//             posiIndex += 2;
//         }
//     }
//     return ans;
//   }


}
