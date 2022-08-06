public class automorphicNumber {
    public static void main(String[] args) {
        int n = 26;
        String s = "";
        int square = (int)Math.pow(n,2);
        s = s + square;
        int i = 1;
        while (i<=s.length()) {
            int temp = square % (int)Math.pow(10,i);
            if (temp == n) {
                System.out.println("Automorphic Number!");
            }
            else{
                System.out.println("Not AM!");
                break;
            }
            i++;
        }
    }
}
