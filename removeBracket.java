public class removeBracket {
    public static void main(String[] args) {
        String s = "a+((b+c)+d)";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')' || s.charAt(i)=='{' ||s.charAt(i)=='}'||s.charAt(i)=='['||s.charAt(i)==']' ){
                s = s.substring(0,  i)+s.substring(i+1);
                i--;
            }
        }
        System.out.println(s);
    }
}
