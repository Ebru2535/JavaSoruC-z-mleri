package day06_IfELseStatements;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        // kullanıcından cinsiyetini ve yaşını alın
        // kadın, 60 yas ve üzeri, erkek 65 yaş ve üzeri emekli olabilir,
        // cinsiyet ve yasını dıkkate alarak "emekli olabilirsin"
        // veya "emekli olmak için  .. yıl daha çalışman gerekir" yazdırın.
        /*
         eger degişken sayımız birden fazla ise
         değişkenlerden birini önceliğe alarak,
         ona göre bir ıf else yapısı kurulur örnegin bu soruda kadın erkek secmini ana değişken yapalım
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi yazınız\n K : KADIN, E : ERKEK");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("lütfen tamsayı olarak yaşınızı giriniz");
        int yaş = scan.nextInt();

        if (cinsiyet == 'K' || cinsiyet == 'k') {    //kadın olanlar için bu bölüm çalışaaxal
            if (yaş < 18 || yaş > 80) System.out.println("gcersiz yaş");
            else if (yaş >= 60) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olamk için" + (60 - yaş) + "yıl daha çalışmalsıın");

        } else if (cinsiyet == 'E' || cinsiyet == 'e') { //kadın olanlar için bu bölüm çalışaaxal
            if (yaş < 18 || yaş > 80) System.out.println("gcersiz yaş");
            else if (yaş >= 65) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olamk için" + (65 - yaş) + "yıl daha çalışmalsıın");

        } else {
            System.out.println("cinsiyet bilgisi hatalı");
        }
    }
}