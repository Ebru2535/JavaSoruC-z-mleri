package WhileLoop;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin
        Scanner scan = new Scanner(System.in);

        int girilenSayı=1;
        int sayıAdedi=0;
        int toplam=0;
        while (girilenSayı!=0){
            System.out.println("lütfen toplanmasını istediğiniz sayıları giriniz \n" +
                    " Bitirmek istediğiniz zaman 0 ' a basınız");
            girilenSayı= scan.nextInt();
            if(girilenSayı>0){
                toplam+=girilenSayı;
                sayıAdedi++;
            }

        }
        System.out.println("Girilen sayılar toplamı: "+sayıAdedi+ "adet sayı girdiniz" +toplam);
    }
}