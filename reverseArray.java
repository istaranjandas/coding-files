public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i=0;i<(arr.length)/2;i++){
            swap(arr,i,arr.length-i-1);
        }
        for(int i =0;i<arr.length;i++)
        System.out.print(arr[i]+",");
    }
    static void swap(int[] arr, int f, int l) {
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
