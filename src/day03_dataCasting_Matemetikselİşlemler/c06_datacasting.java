package day03_dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class c06_datacasting {
    public static void main(String[] args) {
        // soru5 kulanıcıdan bir tam sayı ve bir doble sayı alın,
        // daouble sayıyı ikinci sayıya bölün
        // ve bölüm işleminin sonucunuun tamsayı kısmını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir double sayı giriniz");
        double sayıDbl= scan.nextDouble();
        System.out.println("Lütefen bir tamsayı giriniz");
        int sayıInt= scan.nextInt();

        System.out.println((int) (sayıDbl/sayıInt)); //sonuucu daouble olraka verir


    }
}
