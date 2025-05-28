import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        sum1();
    }
    static void sum1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        in.close();
    }
    
}