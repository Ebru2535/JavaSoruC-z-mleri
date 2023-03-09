package day_kendim.my_works;

import java.util.Scanner;

public class E13_whileloop {
    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali

        Scanner scan = new Scanner(System.in);

        String sıfre = "";
        int flag = 0;
        int denemeSayısı = 0;
        while (flag != 4) {
            flag=0;
            System.out.println("lütfen bir şifre girniz");
            String sifre = scan.nextLine();
            if (sifre.charAt(0)>='a'&& sifre.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("şifre küçük harf olmalı");
            }
            if(sifre.charAt(sifre.length()-1) >='A'&& sifre.charAt(sifre.length()-1)<'Z'){
                flag++;

            }else {
                System.out.println("şifre son karakter büyük harf olmalı");
            }
            if(!sifre.contains(" ")){
                flag++;

            }else {
                System.out.println("şifre boşluk içermemeli");
            }
            if(sifre.length()>=8){
                flag++;
            }else {
                System.out.println("şifre en az 8 karakter uzunluğunda olmalı ");
            }
            denemeSayısı++;
        }
        System.out.println("Tebrikler !"+denemeSayısı+". denemede şifreniz başarılı kaydedildi");
    }
}