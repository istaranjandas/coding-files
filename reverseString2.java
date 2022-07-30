import java.util.Arrays;
import java.util.Stack;

public class reverseString2 {
    public static void main(String[] args) {
        String s = "HELLO";
        char ns[] = new char[s.length()];
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            ns[i] = stack.pop();
        }
        System.out.println(Arrays.toString(ns));
    }
}
