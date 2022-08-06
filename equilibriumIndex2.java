public class equilibriumIndex2 {
    public static void main(String[] args) {
        int arr[] = {-1,1,2};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int rightSum = sum, leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (rightSum == leftSum) {
                System.out.println("index: "+i);
            }
            leftSum += arr[i];
        }
    }
}
