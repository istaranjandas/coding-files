public class equilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {2,3,-1,8,4};
        for (int i = 1; i < arr.length - 1; i++) {
            int sum1 = summ(arr,0,i-1);  
            int sum2 = summ(arr,i+1,arr.length-1);
            if (sum1 == sum2) {
                System.out.println("Index: "+i);
            }
        }
         
    }

    private static int summ(int[] arr,int j, int i) {
        int sum = 0;
        while (j<=i) {
            sum += arr[j];
            j++;
        }
        return sum;
    }

}
