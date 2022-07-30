public class removeBracket2 {
    public static void main(String[] args) {
        String s = "((A+B)+C+D)";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
