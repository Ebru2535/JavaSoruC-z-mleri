package WhileLoop;

public class TamBölenYazdırma {
    public static void main(String[] args) {
        // While loop kullanarak 2 basamakli
        // 7 ile bolunebilen pozitif tamsayiları yazdirin.

        int sayı=10;
        while (sayı<100){
            if(sayı%7==0){
                System.out.print(sayı+ " ");

            }sayı++;
        }
    }
}
