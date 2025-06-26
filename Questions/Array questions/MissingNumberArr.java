public class MissingNumberArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5}; // Example array with a missing number
        int N = arr.length; // Since one number is missing
        System.out.println("Missing number is: " + missingNumber(arr, N));
    }

    // static int missingNumber(int [] arr,int N){
    //     int sum= N * (N+1) / 2;
    //     int s2=0;
    //     for (int i = 0; i < N-1; i++) {
    //         s2+=arr[i];
    //     }
    //     int missingnumber=sum-s2;
    //     return missingnumber;
    // }

    //xor approach
    static int missingNumber(int [] arr,int N){
        int xor1=0;
        int xor2=0;
        for (int i = 0; i < N-1; i++) {
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^N;
        return(xor1 ^ xor2);
    }

}
