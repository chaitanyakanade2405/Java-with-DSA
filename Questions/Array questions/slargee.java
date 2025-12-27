public class slargee {
    public static void main(String[] args) {
        int[] arr ={3,9,5,4,2,7,5,1};
        int slargest = secondLargestt(arr);
        System.out.println("Second Largest Element:" + slargest);
    }

    static int secondLargestt(int arr[]){
        int largest = arr[0];
        int slargest = -1;

        for(int i= 1;i<arr.length-1;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
}
