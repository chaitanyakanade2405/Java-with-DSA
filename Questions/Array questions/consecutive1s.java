public class consecutive1s {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
     static int findMaxConsecutiveOnes(int[] arr) {
        int currentCount = 0;
        int maxCount = 0;
        if(arr.length<1) return 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==1){
                currentCount+=1;
                if(currentCount>maxCount){
                    maxCount = currentCount;
                }
            }
            else{
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
