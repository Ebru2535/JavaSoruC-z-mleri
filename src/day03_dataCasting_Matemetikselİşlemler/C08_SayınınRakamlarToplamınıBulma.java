package day03_dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class C08_SayınınRakamlarToplamınıBulma {
    public static void main(String[] args) {

        // kullanıcıdan 4 basamaklı bir tamsayı alın
        // sayının rakamlar toplamını bulun
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 Basamaklı pozitif tamsayı girin:");

        int girilenSayı= scan.nextInt(); //lightshot
        int birlerBasamağı= 0;
        int rakamlarToplamı=0;

        birlerBasamağı=girilenSayı%10;
        rakamlarToplamı= rakamlarToplamı +birlerBasamağı;
         girilenSayı= girilenSayı/10; //245

        birlerBasamağı=girilenSayı%10;
        rakamlarToplamı=rakamlarToplamı+birlerBasamağı;

        girilenSayı= girilenSayı/10;
        birlerBasamağı=girilenSayı%10;
        rakamlarToplamı=rakamlarToplamı+birlerBasamağı;
         girilenSayı=girilenSayı/10;

         birlerBasamağı=girilenSayı%10;
         rakamlarToplamı=rakamlarToplamı+birlerBasamağı;
         girilenSayı=girilenSayı/10;
        System.out.println("girilen sayının rakamlar toplamı:" + rakamlarToplamı);







    }
}
