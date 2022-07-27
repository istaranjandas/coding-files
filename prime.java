public class prime {
    public static void main(String[] args) {
        int a = 10; boolean flag = false;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i!=0){
                flag = false;
            }
            else
                flag = true;
        }

        System.out.println("Prime:"+flag);
    }
}
