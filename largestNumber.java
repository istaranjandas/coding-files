public class largestNumber {
    public static void main(String args[]) {
        int arr[] = {5,4,3,2,1};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest number is: "+max);
    }
    
}
