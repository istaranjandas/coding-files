public class pallindromeInRange {
    public static void main(String[] args) {
        int a = 10, b = 100;
        for(int i = a;i<=b;i++){
            if(pallindrome(i)==true){
                System.out.println(i+"\n");
            }
        }
    }
    public static boolean pallindrome(int a) {
        int b = reverse(a);
        if(a==b){
            return true;
        }
        else{
            return false;
        }
    }
    public static int reverse(int a) {
        int x = 0;
        while(a!=0){
            int n = a%10;
            x = (x*10)+n;
            a = a/10;
        }
        return x;
    }
}
