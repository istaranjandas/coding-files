import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int l = 0;
        int r = arr.length - 1;
        mergesort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid+1;
        int k = l;
        int[] b = new int[100000];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                b[k] = arr[i];
                i++;
            }
            else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=r){
                b[k] = arr[j];
                k++;
                j++;
                
            }
        }
        else{
            while(i<=mid){
                b[k] = arr[i];
                k++;
                i++;
                
            }
        }
        for(k=l;k<=r;k++){
            arr[k] = b[k];
        }
    }
}
