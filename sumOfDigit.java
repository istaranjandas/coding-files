public class sumOfDigit {
    public static void main(String[] args) {
        int a = 343, sum = 0;
        while(a!=0){
            int reminder = a % 10;
            sum += reminder;
            a = a/10;
        }

        System.out.println(sum);
    }
}
