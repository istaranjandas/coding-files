public class bubbleSort {
    public static void main(String args[]){
        int arr[]= {5,4,3,2,1};
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}
