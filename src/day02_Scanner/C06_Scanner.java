package day02_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Karesini almak istediğiniz sayıyı giriniz");
        double giriLenSayı = scan.nextDouble();
        System.out.println("Girilen sayının karesi;"+giriLenSayı * giriLenSayı);
    }


}