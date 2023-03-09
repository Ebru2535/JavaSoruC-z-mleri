package E01_Grup;

import java.util.Scanner;

public class C15_method {
    public static void main(String[] args) {
        // soru3 Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //sonuclarini donduren bir method olusturun.

        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayı giriniz.... :");
        int sayı= scan.nextInt();

        System.out.println(asalMi(sayı));
    }
    public static String asalMi(int number){
        int flag=0;
        for (int i = 2; i < number; i++) {
          if(number%i==0){
              flag++;
              break;
          }
        }
        if(flag==0){
            return "asal sayi";

        }else {
            return "asal sayı değil";
        }
    }
}
