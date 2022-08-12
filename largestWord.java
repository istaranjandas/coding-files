public class largestWord {
    public static void main(String[] args) {
        int max=0;int z=0,z2=0;String s1 = "";
        String s = "I am Istaranjan. My friend is myself.".trim();
        s = " "+s+" ";
        int spaces = 0;
        for (int i = 0; i < s.length();) {
            if(s.charAt(i)!=' '){
                i++;
                z2 = i+1;
            }
            else if (s.charAt(i)==' ' || s.charAt(i)!='.') {
                z = i;
                i++;
                spaces++;
            }
            int length = s.substring(z,z2).length();
            if(length > max){
                max = length;
                s1 = s.substring(z, z2);
            }
        }
        System.out.println(s1);
        System.out.println("Number of words are: "+ (spaces-1));
    }
    
}
