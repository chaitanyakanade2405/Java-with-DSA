public class missingNum {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumberoptimal(arr));
    }
    //brute
    static int missingNum(int[] arr) {
        for(int i=0;i<=arr.length;i++){
            boolean found = false;

            for(int j = 0;j<arr.length;j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return  -1;
    }
     //optimal
     static int missingNumberoptimal(int[] arr) {
        int n = arr.length;
        int sum = (n*(n+1)) / 2;
        int s2 = 0;
        for(int i =0;i<arr.length;i++){
            s2 += arr[i];
        }
        return sum - s2;
    }
}
