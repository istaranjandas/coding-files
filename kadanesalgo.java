public class kadanesalgo {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        int product1 = arr[0];
        int product2 = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(arr[i], Math.max(product1 * arr[i], product2 * arr[i]));
            product2 = Math.min(arr[i], Math.min(product1 * arr[i], product2 * arr[i]));
            product1 = temp;
            result = Math.max(result, product1);
        }
        System.out.println(result);
    }
}
