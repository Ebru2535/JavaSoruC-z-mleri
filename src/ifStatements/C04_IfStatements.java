package ifStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        /* if cümllerinde sart parantezinden sonra bady kullanmazsak
        ilk;e kadar olan kısmı bady olarak kabul eder yani sadece
        1 satır kodu olarak kabul eder.
        /*
        /*eger if badysi için yazılaak kod satırdan fazla ise
         mutlaka {} kullanılmalıdır
         */

        /*kullanıcıdan bir saı alın,
        sayı 3 e bölünüyorsa "üç "ile bölünebilen sayı",
        5 le bölünbiliyorsa"beş ile bölünebilen sayı" yazdırın
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int girilenSayı= scan.nextInt();

        if(girilenSayı%3==0) System.out.println("3 ile bölünen sayı");
        if(girilenSayı%5==0) System.out.println("5 ile bölünen sayı");

        //hem 3 ehem de 5 e bölünen sayı
        Scanner san= new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
         int isteniLensayı= scan.nextInt();

         if(isteniLensayı%3==0 && isteniLensayı%5==0);
        System.out.println("hem 5'e hem de 3'e bölünebilen sayı");



    }
}
