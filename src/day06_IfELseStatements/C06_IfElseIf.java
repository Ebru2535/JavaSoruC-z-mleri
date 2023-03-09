package day06_IfELseStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
        // kullanıcından cinsiyetini ve yaşını alın
        // kadın, 60 yas ve üzeri, erkek 65 yaş ve üzeri emekli olabilir,
        // cinsiyet ve yasını dıkkate alarak "emekli olabilirsin"
        // veya "emekli olmak için  .. yıl daha çalışman gerekir" yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("cinsiyetinizi yazınız\n K : KADIN, E : ERKEK");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("lütfen tamsayı olarak yaşınızı giriniz");
         int yaş= scan.nextInt();

         if ((cinsiyet=='k'|| cinsiyet=='K') && yaş>=60){
             System.out.println("Emekli olabilir");
         }else if ((cinsiyet=='k'|| cinsiyet=='K') && yaş>=18){
             System.out.println("Eemekli olabilmekiçin" + (60-yaş) + "yıl daha çalışmalısın");
         }else if ((cinsiyet=='e'|| cinsiyet=='E') && yaş>=65){
            System.out.println("Emekli olabilir");
         }else if ((cinsiyet=='e'|| cinsiyet=='E') && yaş>=18){
             System.out.println("Eemekli olabilmekiçin" + (65 - yaş) + "yıl daha çalışmalısın");
         }else{
             System.out.println("geçersiz bilgi");
         }

    }
}
