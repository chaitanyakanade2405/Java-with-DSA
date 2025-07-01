public class LeaderArr {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printLeadersOptimal(arr, n);

    }
    public static void printLeadersOptimal(int[] arr, int n) {
        int max = arr[n - 1];
        System.out.print(max + " "); // Last element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
}
