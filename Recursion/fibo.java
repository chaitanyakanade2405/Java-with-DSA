package Recursion;
public class fibo {
    public static void main(String[] args) {
        System.out.println(fibonacii(6));
    }

    static int fibonacii(int n){
        if(n<2){
            return n;
        }
        return fibonacii(n-1) + fibonacii(n-2);
    }
}
