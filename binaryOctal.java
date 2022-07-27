public class binaryOctal {
    public static void main(String[] args) {
        String a = "1100110";
        int n = a.length();
        String s ="";
        if(n%3 == 1){
            a = "00"+a;
        }
        else if(n%3==2){
            a = "0"+a;
        }
        n = a.length();
        for(int i=0;i<n;i+=3){
            int temp = (a.charAt(i) - '0')*4 + (a.charAt(i+1) - '0')*2 + (a.charAt(i+2) - '0')*1;
            s = s + Integer.toString(temp);
        }
        System.out.println(s);
    }
}
