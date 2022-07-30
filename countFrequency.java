import java.util.HashMap;
import java.util.Map;

public class countFrequency {
    public static void main(String[] args) {
        int arr[] = {2,3,2,3,3,4,5,5,3,4,5};
        countFreq(arr);

    }

    static void countFreq(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> r = new HashMap<>();
        for(int i=0;i<n;i++){
            if(r.containsKey(arr[i])){
                r.put(arr[i],r.get(arr[i])+1);
            }
            else{
                r.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> i : r.entrySet()) {
            // System.out.println(i);
            System.out.println(i.getKey()+":"+i.getValue());
            // c++;
        }
        
    }
}
