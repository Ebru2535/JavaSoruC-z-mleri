package stringManipulations;

import java.util.Scanner;

public class C02_kendım {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //      Girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi, soyisminizi, yasınızı giriniz" +
                "\nher bilgiden sonra ENTERe basınız");

        char ilkHarf = scan.nextLine().charAt(0);

        String soyisim = scan.nextLine();
        double yas = scan.nextDouble();
        System.out.println(" Girilen bilgiler :" + ilkHarf + "," + soyisim + "," + yas);

    }

    public static class C02_equls {
        public static void main(String[] args) {
            String str1 = "Java";

            String str2 = "Java";

            String str3 = new String("Java");
            String str4 = "Ja";
            String str5 = str4.concat("va");


            System.out.println(str1 == str2); // true
            System.out.println(str1 == str3); //false
            System.out.println(str1 == str5); // false

            /*
            == strıng iim bekledğiniz sonu.çları vermeyebilir
            çünkü hem metnın değerini hem  de objenın referansını karşılaştırır

            java da strıng ıfadeleri  metınlerınınn aynı olup olamdığını kkontroletmek ıcın
            == yerıne equal methodu kullanılmalıdır
             */
            System.out.println(str1.equals(str2));// true
            System.out.println(str1.equals(str3));// true
            System.out.println(str1.equals(str5)); // true

            String a = "Alvin";
            String b = "Alvin";
            System.out.println("b.equals(a) = " + true);

            String z = new String("Alvin");
            String v = new String("Alvin");
            System.out.println(a.equals(z));

            System.out.println("a==z = " + a == z);
            System.out.println(z==v);

            // kullanıcıdan bir maıl alın
            // maıl @ icermiyorsa "geçersiz maıl"
            // maiıl gmail içermiyorsa "mail gmail içermeli"
            //mail gmail.com ile bitmiyorsa mail de yazım hatası var yazmalı
            Scanner maıl= new Scanner(System.in);
            System.out.println("ütfen mail giriniz");
            String girilenMail= maıl.next();

            if(!girilenMail.contains("@")){
            System.out.println("gecersiz maıl");
            }else if (!girilenMail.contains("gmail")){
                System.out.println("mail gmail icermeli");
            }else if (!girilenMail.endsWith("gmail.com")){
                System.out.println("yazım hatası var");
            }

        }
    }
}
