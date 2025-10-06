package Revision;
public class fibinacii {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fibo sequence:");
        fibo(n);
    }

    static void fibo(int n){
        int a=0;
        int b=1;
        System.out.print(a+" "+b);

        for(int i =2;i < n;i++){
            int c = a + b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
