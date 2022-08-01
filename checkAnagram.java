import java.util.HashMap;
import java.util.Map;
public class checkAnagram {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "CBA";
        countFreq(s1+s2);

    }

    static void countFreq(String s) {
        int n = s.length();
        HashMap<Character,Integer> r = new HashMap<>();
        for(int i=0;i<n;i++){
            if(r.containsKey(s.charAt(i))){
                r.put(s.charAt(i),r.get(s.charAt(i))+1);
            }
            else{
                r.put(s.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> i : r.entrySet()) {
            if(i.getValue() == 1){
                System.out.println("Not an amalgram!");
                break;
            }
            else{
                System.out.println("Amalgram!");
                break;
            }
        }
    }
}