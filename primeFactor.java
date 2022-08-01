public class primeFactor {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 2; i*i <= n || n > 1; i++) {
            if(n%i == 0){
                while (n%i == 0) {
                    System.out.print(i+",");
                    n=n/i;
                }
            }
        }
    }
}
