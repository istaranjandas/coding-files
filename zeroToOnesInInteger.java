public class zeroToOnesInInteger {
    public static void main(String[] args) {
        int n = 201, sum = 0, a = 1;
        while (n!=0) {
            int temp = n % 10;
            if(temp == 0){
                temp = 1;
            }
            sum = sum + temp * a;
            a = a *10;
            n = n/10;
        }
        System.out.println(sum);
    }
}
