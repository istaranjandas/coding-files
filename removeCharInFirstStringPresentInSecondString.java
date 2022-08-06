import java.util.HashMap;

public class removeCharInFirstStringPresentInSecondString {
    public static void main(String[] args) {
        String s1 = "cefz";
        String s2 = "abcdef";
        StringBuffer s = new StringBuffer();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i), 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if(hm.get(s2.charAt(i))==null){
                s.append(s2.charAt(i));
            }
        }
        System.out.println(s);
    }
}
