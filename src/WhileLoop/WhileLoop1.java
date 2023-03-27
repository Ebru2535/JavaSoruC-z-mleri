package WhileLoop;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        // kullanıcdan sayılar al
        // sayı toplamı 500 u asınca
        // kacsayı gidiğini ve sayılar toplamııı yazıdr

        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int girilensayı = 0;
        int girilenSayıAdedi = 0;


        while (toplam < 500) {
            System.out.println("lütfen sayılaar gir");
            girilensayı= scan.nextInt();
            toplam += girilensayı;
            girilenSayıAdedi++;

        }
        System.out.println("Toplam " + girilenSayıAdedi + " adet sayı girildi ve toplamı" + toplam);


    }
}