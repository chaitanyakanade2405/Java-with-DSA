public class countnum {
    public static void main(String[] args) {
        int n=3244448;
        int count=0;
        while(n>0){
            if(n%10==4){
                count++;
            }
            n=n / 10; 
        }
        System.out.println("Count of 4's in the number: " + count);
    }
}
