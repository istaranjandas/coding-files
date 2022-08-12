import java.util.HashMap;

public class wordWithHighestRepeatingLetters {
    public static void main(String[] args) {
        String s = "aabbcc abc aabbbcc";
        s = " "+s+" ";
        String s2 = "";
        int z=0,z2=0; String s1 = "";
        int max = 0;
        int mor = 0;
        for (int i = 0; i < s.length();) {
            if(s.charAt(i)!=' '){
                i++;
                z2 = i+1;
            }
            else if (s.charAt(i)==' ' || s.charAt(i)!='.') {
                z = i;
                i++;
            }
            s1 = s.substring(z, z2);
            System.out.println(s1);
            mor = maxOccuringCharacter(s1);
            if(mor>max){
                max = mor;
                s2 = s1;
            }
        }
        System.out.println(s2+":"+max);
    }

    private static int maxOccuringCharacter(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (h.containsKey(s.charAt(i))==false) {
                h.put(s.charAt(i), 1);
            }
            else{
                h.put(s.charAt(i), h.get(s.charAt(i))+1);
            }
        }
        int max = 0;char ans=' ';
        for (int i = 0; i < s.length(); i++) {
            if(h.get(s.charAt(i))>max){
                max = h.get(s.charAt(i));
                ans = s.charAt(i);
            }
        }
        return max;
    }
}
