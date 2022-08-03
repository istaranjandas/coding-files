public class lcm {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 8;
        int gecede = gcd(n1,n2);
        System.out.println(lcm(n1,n2)/gecede);
    }
    public static int lcm(int n1, int n2) {
        return (n1*n2);
    }
    public static int gcd(int n1,int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2, n1%n2);
    }
}
