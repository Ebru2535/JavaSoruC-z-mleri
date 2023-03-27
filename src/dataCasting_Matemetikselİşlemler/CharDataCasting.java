package dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class CharDataCasting {
    /* char data türününn ekstra br özelliği vardır
    eger matematiksel bir işlemde char data türündenbir değer kullanırsanız
     java o değerin aski değerni gercekleştirir.
     */
    public static void main(String[] args) {
        System.out.println('a'+'b'); // 97+98=195

        System.out.println('a'-32); // 97-32=65
        // 'a'- 32 nın char olrraka sonucunu yazınız
        System.out.println((char)('a'-32));


        //kullannıcan bır char alıp
        // askı tablo dan kullanıcınn girdiği char ı sonrasındaki3 karakteri yazdırın
        /* örnekinput =a output:b,c,d
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarekter = scan.next().charAt(0);

        System.out.println((char) (girilenKarekter+1)+ ","+
                           (char) (girilenKarekter+2) +","+
                            (char) (girilenKarekter+3));
    }

}
