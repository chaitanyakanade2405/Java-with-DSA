// import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
    //     Scanner in =new Scanner (System.in);
    //     System.out.print("Enter a number: ");
    //     int n = in.nextInt();
    //    System.out.println(isArmstrong(n));
    //     in.close();
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i); // Print Armstrong numbers between 100 and 999
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem; // For 3-digit Armstrong numbers
        }
        return sum == original; // Check if the sum of cubes equals the original number
    }
}
