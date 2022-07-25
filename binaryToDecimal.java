import java.io.*;
import java.util.*;
public class binaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int dec = btod(s);
        System.out.println(dec);
    }
    public static int btod(String s) {
        int l = s.length();
        int base = 1;
        int ans = 0;
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans = ans + base;
            }
            base = base * 2;
        }
        return ans;
    }
}
