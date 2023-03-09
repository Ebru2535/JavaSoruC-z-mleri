package day02_Scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen sayı1'i giriniz");
        int sayı1= scan.nextInt();
        System.out.println("Lütfen sayı2'i giriniz");
        int sayı2= scan.nextInt();

        int temp;
        temp= sayı2;
        sayı2=sayı1;
        sayı1= temp;
        System.out.println("sayıların yerini değiştirdim"
                           +"\nsayı1'in yeni değeri:"+ sayı1
                           + "\nsayı2'nin yeni değeri:"+sayı2);

    }
}


