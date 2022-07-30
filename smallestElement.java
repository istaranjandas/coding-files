public class smallestElement {
    public static void main(String args[]) {
        int arr[] = {5,4,3,2,1};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest number is: "+min);

    }
    
}
