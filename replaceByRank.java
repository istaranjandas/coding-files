import java.util.Arrays;
import java.util.HashMap;

public class replaceByRank {
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,98,6};
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        int temp = 1;
        HashMap<Integer,Integer> h = new HashMap<>();
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if(h.get(arr2[i])==null){
                h.put(arr2[i], temp);
                temp++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++) {
            System.out.print(h.get(arr[i])+" ");
        }
    }
}
