package Revision;
public class primecheck{
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPrimeno(n));
    }

    static boolean isPrimeno(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}