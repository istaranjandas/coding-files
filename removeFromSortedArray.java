
import java.util.HashSet;

public class removeFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3};
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        int l = hs.size();
        System.out.println(l);
        int j=0;
        for (int  i: hs) {
            arr[j++] = i;
        }
        for (int i = 0; i < l; i++) { 
            System.out.print(arr[i]+" ");
        }
    }
}
