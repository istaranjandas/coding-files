import java.util.HashMap;

public class maxOccuringCharacter {
    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        String s = "Istaranjan".toLowerCase();
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
        System.out.println(ans);
        System.out.println(elapsedTime);
    }
}
