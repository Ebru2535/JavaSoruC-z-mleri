package day03_dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class c03_dataCasting {
    public static void main(String[] args) {
        System.out.println(28/5);
        System.out.println(29/3);
        // java bir bölme işleminde 2 int işleme giriyosa sonucu int olarak verir.

        int sayı=50;
        int sayı2=4;
        System.out.println(sayı/sayı2);

        double dbl=4;
        System.out.println(sayı/dbl); // 12.5

        //kullanıcıdan 2 tamsayı alın
        //1. tamsayıyı 2.ye bölüp sonucu ondalı olarak yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println( "Lütfen birbirinebölmek için iki tam saı girin");
         int a= scan.nextInt();
         int b= scan.nextInt();
        System .out.println("iki sayının bölme sonucu:" +(double)a/b);



    }
}
