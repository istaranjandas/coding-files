import java.util.HashMap;
import java.util.Map;

public class removeDuplicatesUnsorted {
    public static void main(String[] args) {
        int arr[] = {2,3,1,3,1,2};
        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> i : hm.entrySet()) {
            System.out.print(i.getKey()+" ");
        }

    }
}
