package day10_stringManipulations;

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
}
