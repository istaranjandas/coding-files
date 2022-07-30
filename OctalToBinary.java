public class OctalToBinary {
    public static void main(String[] args) {
        int octal = 345;
        int decimal = octalToDecimal(octal);
        int binary = decimalToBinary(decimal);
        System.out.println(binary);
    }

    private static int decimalToBinary(int decimal) {
        int binary =0;
        int i = 0;
        while(decimal!=0){
            int remainder = decimal % 2;
            binary += remainder * Math.pow(10,i);
            i++;
            decimal = decimal / 2;
        }
        return binary;
    }

    private static int octalToDecimal(int octal) {
        int decimal =0;
        int i = 0;
        while(octal!=0){
            int remainder = octal % 10 ;
            decimal += remainder * Math.pow(8,i);
            i++;
            octal = octal / 10;
        }
        return decimal;
    }
}
