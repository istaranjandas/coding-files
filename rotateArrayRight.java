import java.util.Arrays;

public class rotateArrayRight {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int arr2[] = {1,2,3,4,5,6,7};
        int k = 2;
        if (k>arr.length) {//if k is greater than length then the perfect position is this
            k = k % arr.length;
        } 
        if (k>0) {//if k is greater than 0 then only swap because k-1 will be 0-1 = -1, and index out of bound
            int n = arr.length;
            rotate(arr, 0, n - k - 1);
            rotate(arr, n - k, n - 1);
            rotate(arr, 0, n - 1);
            System.out.println("Rotate Right: "+Arrays.toString(arr));
        }
        if (k>0) {//if k is greater than 0 then only swap because k-1 will be 0-1 = -1, and index out of bound
            int n = arr2.length;
            rotate(arr2, 0, k - 1);
            rotate(arr2, k, n - 1);
            rotate(arr2, 0, n - 1);
            System.out.println("Rotate Left: "+Arrays.toString(arr2));
        }
        
    }

    private static int[] rotate(int[] arr, int start, int end) {
        while (start<=end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
