public class selectionSort {
    public static void main(String[] args) {
        int arr[]={-87,90,8,4,-90};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int last = arr.length - i - 1;
            int max = maxIndex(arr,last);
            swap(arr,max,last);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    static void swap(int[] arr, int f, int l) {
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }

    static int maxIndex(int[] arr, int last) {
        int max = 0;
        for(int i=1;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
