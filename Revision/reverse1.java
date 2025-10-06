package Revision;
public class reverse1 {
    public static void main(String[] args) {
        int n = 23567;
        revnum(n);
    }

    static void revnum(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
