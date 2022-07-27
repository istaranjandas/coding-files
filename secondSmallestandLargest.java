public class secondSmallestandLargest {
    public static void main(String args[]) {
        int arr[] = {5,4,3,2,1};
        int min = arr[0];
        int min2 = arr[0];
        int max = arr[0];
        int max2 = arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min2 && arr[i]!=min){
                min2 = arr[i];
            }
        }
        System.out.println("Smallest number is: "+min);
        System.out.println("Smallest 2 number is: "+min2);
        for(int i=1;i<arr.length;i++){  
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){  
            if(arr[i] > max2 && arr[i]!=max){
                max2 = arr[i];
            }
        }
        System.out.println("Largest number is: "+max);
        System.out.println("Largest 2 number is: "+max2);

    }
    
}