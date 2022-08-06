public class changeLetterToNextAlphabet {
    public static void main(String[] args) {
        String s = "abcde";
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            x.append((char)((int)s.charAt(i) + 1));
        }
        System.out.println(x);
    }
}
