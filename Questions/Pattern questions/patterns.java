public class patterns {
    public static void main(String[] args) {
       pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
