public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        for(int i=0;i<n-1;i++){// i goes till n-2 cause j is i+1, and it can go outofbound
            for(int j=i+1;j>0;j--){// j goes from i+1 to 1 and checks all minimum and swaps
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+"");
        }
    }
    static void swap(int[] arr, int f, int l) {
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
