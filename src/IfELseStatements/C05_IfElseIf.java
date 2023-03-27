package IfELseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {
        // ÖRNEK
        // ÖĞRENCININ NOTU 85 VE USTU İSE AA,
        // 85 VE ÜSU DEĞ,LSE 65 VE ÜSTÜ İSE BB,
        // 65 VE ÜSTÜ DEĞİLSE 50 VE ÜSTU İSE CC,
        // GERİYE KALANLAR DD
        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<0 || not<100){
            System.out.println("gecersiz not");
        }else if (not>=85){
            System.out.println("notunuz AA");
        }else if (not>=65){
            System.out.println("notunuz BB");
        }else if (not>=50){
            System.out.println("notunuz CC");
        }else{
            System.out.println("notunuz DD KALDINIZ");
        }
    }
}
