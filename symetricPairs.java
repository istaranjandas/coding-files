import java.util.HashMap;

public class symetricPairs {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,1},{3,4},{4,5},{5,4}};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int f = arr[i][0];
            int s = arr[i][1];
            if(hm.get(s)!= null && hm.get(s) == f){
                System.out.println(f+","+s);
            }
            else{
                hm.put(f,s);
            }
        }
    }
}
