public class removeDuplicateLetters {
    public static void main(String[] args) {
        String s = "istaranjan";
        boolean a[] = new boolean[26];
        String ans = " ";
        for (int i = 0; i < s.length(); i++) {
            if(a[s.charAt(i) - 'a'] == false){
                ans = ans + s.charAt(i);
                a[s.charAt(i) - 'a'] = true;
            }
        }
        System.out.println(ans);
    }
}
