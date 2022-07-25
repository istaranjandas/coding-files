public class pallindromeString {
    public static void main(String[] args) {
        String s = "S";
        int f = 0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt((s.length()-1)-i)){
                f = 1;
            }
            else{
                System.out.println("Not Pallindrome!!");
                break;
            }
        }
        if(f==1){
            System.out.println("Pallindrome!!");
        }
    }
}
