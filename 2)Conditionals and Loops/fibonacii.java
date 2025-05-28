import java.util.Scanner;
public class fibonacii {
    public static void main(String[] args) {
       Scanner in= new Scanner (System.in);  
        System.out.println("Enter the no. of terms in Fibonacii series:");
       int n=in.nextInt();
       int a=0;
       int b=1;
       int count=2;

       while (count<=n) {
        int temp=b;
        b=b+a;
        a=temp;
        count++;
       }
       System.out.println("Fibonacii no.:-");
       System.out.println(b);
       in.close();
    }
}
