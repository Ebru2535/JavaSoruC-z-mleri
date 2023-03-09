package day08_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C01_stringManpulation {
    public static void main(String[] args) {
        /* kullnıcıdan gunn isminigirmesini isteyın,
        girilen gun hafta ıcı birgun ise "şimdi çalışma xamaznı tatile .. gun var"
        seklınde hafta sınu tatılıne kac gun kaldığını yazdırın,
        giriilen gun hafta sonu ıse "şşimdi dinlenme zzzamannı" yazdırın
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen gun smini giriniz");
        String girilenGun= scan.next();
        String kullanılacakGun= girilenGun.toLowerCase();


        /* string ifadeler case sensitive'dir
        kullanıcın pazar pazar PAzar .... gibi 32 şeklinde yazma ihtimali
         */
        switch (kullanılacakGun){
            case "pazartesi" :
                System.out.println(girilenGun + "çalışma zamanı, tatile 5 gun var");
                break;
            case "salı" :
                System.out.println(girilenGun + "calışma zamanı, tatile 4 gun var");
                break;
            case "çarşamba" :
                System.out.println(girilenGun + "calışma zamanı, tatile 3 gun var");
                break;
            case "perşembe" :
                System.out.println(girilenGun + "calışma zamanı, tatile 2 gun var");
                break;
            case "cuma" :
                System.out.println(girilenGun + "calışma zamanı, tatile 1 gun var");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("şimdi dinlenme zamanı");
            default:
                System.out.println("yanlıs gunu ismi");

        }
    }

    public static class C02_toUppercaseLocale {
        public static void main(String[] args) {
            String str = "JAVA CANDIR ";
            System.out.println(str.toLowerCase());// java candir

            str= str.toLowerCase(Locale.forLanguageTag("TR"));
            System.out.println(str); // java candır

             str="sevgiinsanı hayata bağlar";
            System.out.println(str.toUpperCase());
            System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        }
    }
}
