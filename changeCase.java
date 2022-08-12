public class changeCase {
    public static void main(String[] args) {
        String s = "jAVA!";
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                ss.append((Character.toUpperCase(s.charAt(i))));
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ss.append((Character.toLowerCase(s.charAt(i))));
            }
            else{
                ss.append(s.charAt(i));
            }
        }
        System.out.println(ss);
    }
}
