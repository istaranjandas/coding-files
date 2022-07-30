public class decimalToOctal {
    public static void main(String[] args) {
        int decimal = 136;
        octToDec(decimal);
    }

    static void octToDec(int decimal) {
        int i = 0;
        int octal = 0;
        while(decimal!=0){
            int reminder = decimal % 8;
            octal = octal + (reminder * (int)Math.pow(10,i));
            i++;
            decimal = decimal / 8;
        }
        System.out.println(octal);
    }
}
