public class largearr {
    public static void main(String[] args) {
        int [] arr ={3,6,1,2,8,4,9,5};
        int largest= largee(arr);
        System.out.println("Largest element is:" + largest);
    }

    static int largee(int[]arr){
        int largest=arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
