public class sumOfNumsInStr {
    public static void main(String[] args) {
        String s = "th12e3";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
