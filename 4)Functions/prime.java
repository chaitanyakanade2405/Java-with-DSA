import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean result = isPrime(n);
        System.out.println(result);
        in.close();
    }
    static boolean isPrime(int n) {
      if (n<=1){
        return false; // 0 and 1 are not prime numbers
      }
      int c=2;
      while (c*c<=n) {
        if (n%c==0) {
          return false; // n is divisible by c, so it's not prime
        }
        c++;
      }
      return c*c>n; // If c*c is greater than n, then n is prime
      
    }
}
