public class decimalBinary {
    public static void main(String[] args) {
        int a = 4,i = 0;
        int arr[] = new int[32];
        while(a!=0){
            arr[i] = a%2;
            i++;
            a = a / 2;
        }

        //reversing array
        for(i=0;i<(arr.length)/2;i++){ 
            swap(arr,i,arr.length-i-1);
        }
        //printing array
        for (int j : arr) {
            System.out.print(j+" ");
        }

    }
    //swap function
    static void swap(int[] arr, int f, int l) {
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
