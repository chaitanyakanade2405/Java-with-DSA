import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
         int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    // given row and column tell the element at that position
    // static long ncr(int n, int r) {
    //     long res = 1;
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }

    // static int pascalTri(int r, int c) {
    //     int element = (int) ncr(r - 1, c - 1);
    //     return element;
    // }

    // to print the given row of pascal traiangle
    // static void pascalTriangle(int n) {
    // long ans = 1;
    // System.out.print(ans + " ");
    // for (int i = 1; i < n; i++) {
    // ans = ans * (n - i);
    // ans = ans / i;
    // System.out.print(ans + " ");
    // }
    // System.out.println();
    // }

    // to print the pascal triangle
    static List <Integer> generateRow (int row){
        long ans = 1;
        List <Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < row; col++) {
            ans = ans * (row-col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    static List<List <Integer>> pascalTriangle (int n){
        List<List <Integer>>ans = new ArrayList<>();
        for (int  row = 1; row <= n; row++){
            ans.add(generateRow(row));
        }
        return ans;
    }

}
