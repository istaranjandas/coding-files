public class capFirstLast {
    public static void main(String[] args) {
        String s = "istaranjan the serpant";
        StringBuilder sb = new StringBuilder(s);
        
        if (Character.isLowerCase(s.charAt(0)) || Character.isLowerCase(s.charAt(s.length()))) {
            sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
            sb.setCharAt(s.length()-1, Character.toUpperCase(s.charAt(s.length()-1)));
        }

        System.out.println(sb.toString());
    }
}
