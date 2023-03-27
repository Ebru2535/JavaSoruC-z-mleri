package stringManipulations;

import java.util.Random;

public class C05_Legfth {
    public static void main(String[] args) {
        String str= "Java her gecen gun daha da guzellesıyor";
        // sondan 3. karakteri yazdırın

        System.out.println(str.charAt(str.length()-3)); // y
        System.out.println(str.length()); // 39

        // rastgele birkarakterini yazdırlaım

        Random rnd= new Random(); // rnd değeri için 0 ile 1 arasında rastgele  bir değer oluşturur
        int index= rnd.nextInt(str.length()); // str.lenght () den kucuk rastgele bir int verr
        System.out.println(str.charAt(index));
    }
}
