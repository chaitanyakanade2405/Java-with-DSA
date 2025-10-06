package Revision;
public class armstrong1 {
    public static void main(String[] args) {
        int n = 158;
        System.out.println(isArms(n));
    }

    static boolean isArms(int n ){
        int og=n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum=sum+rem*rem*rem;    
        }
        return sum == og;
    }
}
