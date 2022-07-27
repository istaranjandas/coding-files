public class removeCharactersExceptAlphabets {
    public static void main(String[] args) {
        String s = "Istaranjan_is_a_good_boy!";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z') || (s.charAt(i)>='A'&&s.charAt(i)<='Z')){
                continue;
            }
            else{
                s = (s.substring(0, i)+s.substring(i+1));
            }
        }

        System.out.println(s);
    }
}
