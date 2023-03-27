package IfELseStatements;


import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        // kullamıcıdan bir harf isteyın,
        // girilen arakter küçük harf ise onu buyuk harf olarak yazdıırn,
        // yoksa girilen harfi  yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf yazınız");
        char harf = scan.next().charAt(0);

        if (harf>= 'a' && harf<='z'){
            // küçük harfise büyük yazdıralım
            System.out.println(Character.toUpperCase(harf));
            System.out.println((char)(harf-32));
        }else {
            // küçük harf değiilse harfi yazıdr
            System.out.println(harf);
        }
    }
}
