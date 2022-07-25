public class countVCS {
    public static void main(String[] args) {
        String s = "My name is Istaranjan Das";
        int v =0,c=0,sp = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v++;
            }
            else if(s.charAt(i)==' '){
                    sp++;
                }
            else{
                c++;
            }
        }
        System.out.println("Vowels: "+v+"\nConsonant: "+c+"\nSpaces: "+sp);
    }
}
