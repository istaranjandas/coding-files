public class reverseString {
    public static void main(String[] args) {
        String s = "ABCDE";
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }
        System.out.println(sb.toString());

    }

}
