import java.util.HashMap;
import java.util.Map;

public class repeatingElements {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,5,5};
        HashMap<Integer,Integer> r = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(r.containsKey(arr[i])){
                r.put(arr[i],r.get(arr[i])+1);
            }
            else{
                r.put(arr[i],1);
            }
        }
        System.out.println("Repeating Elements");
        for (Map.Entry<Integer,Integer> i : r.entrySet()) {
            if(i.getValue() > 1){
                System.out.println(i.getKey());
            }
        }
        System.out.println("Non repeating Elements");
        for (Map.Entry<Integer,Integer> i : r.entrySet()) {
            if(i.getValue() == 1){
                System.out.println(i.getKey());
            }
        }
    }
}
