package day02_Scanner;

import java.util.Scanner;

public class c10_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı girin");
        double sayıDbl= scan.nextDouble();
        System.out.println("lütfen bir tamsayı girin");
        int sayıInt= scan.nextInt();
        System.out.println("Sayıların toplamı:"+ (sayıDbl+ sayıInt));
        System.out.println("Sayıların çarpımı:" +sayıInt*sayıDbl);


    }
}
