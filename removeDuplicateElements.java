public class removeDuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        int k = j+1;
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
