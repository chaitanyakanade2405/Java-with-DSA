public class CountSubarrXORRk {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;
        System.out.println(Count(arr, k));
    }

    static int Count(int[] arr, int k) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int xorr = 0;
            for (int j = i; j < arr.length; j++) {
                xorr = xorr ^ arr[j];

                if (xorr == k)
                    cnt++;
            }
        }
        return cnt;
    }
}
