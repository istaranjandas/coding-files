import java.util.*;
import java.util.*;
public class pallindrome {
    public static void main(String args[]) {
        int a = 2002;
        int b = reverse(a);
        if(a==b){
            System.out.println("Pallindrome!!");
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

