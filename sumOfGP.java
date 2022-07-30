public class sumOfGP {
    public static void main(String[] args) {
        float a = 2;
        float r = 2;
        int n = 4;
        double sum = (a * (Math.pow(r, n) - 1)) / (r - 1);
        System.out.println(sum);
    }
}
