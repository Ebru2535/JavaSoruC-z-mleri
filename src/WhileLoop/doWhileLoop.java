package WhileLoop;

import java.util.Scanner;

public class doWhileLoop {

     /*   double taban = 2;
        double us = 3;
        double sonuc = Math.pow(taban, us);
        System.out.println("Sonuç: " + sonuc);
          public static void main(String[] args) {

        /*
        Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        olusturun.
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
    int sayi = scan.nextInt();

        System.out.println("Lütfen bir üs kat sayısı giriniz");
    int usSayi = scan.nextInt();

    ussunuHesaplama(sayi, usSayi);

}

    public static void ussunuHesaplama(int sayi, int usSayi) {
        int carpim1 = 1;
        while (usSayi != 0) {
            usSayi--;
            carpim1 *= sayi;
        }
        System.out.println(carpim1);

    }



    }

