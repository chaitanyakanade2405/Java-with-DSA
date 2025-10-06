package Revision;
public class count {
    public static void main(String[] args) {
        int n = 1456556755;
        countocc(n);
    }

    static void countocc(int n){
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n=n/10;
            }
            System.out.println(count);
        }
    }

