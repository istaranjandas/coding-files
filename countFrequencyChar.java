import java.util.HashMap;
import java.util.Map;

public class countFrequencyChar {
    public static void main(String[] args) {
        String s = "ABCCDEE";
        countFreq(s);

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
        System.out.println("Frequency of characters");
        for (Map.Entry<Character,Integer> i : r.entrySet()) {
            System.out.println(i.getKey()+":"+i.getValue()); 
        }
        System.out.println("Frequency of non repeating characters");
        for (Map.Entry<Character,Integer> i : r.entrySet()) {
            if(i.getValue() == 1)
            System.out.print(i.getKey()+" ");
            
        }
        
    }
}
