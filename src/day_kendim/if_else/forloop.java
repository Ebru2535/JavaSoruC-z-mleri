package day_kendim.if_else;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.
        Scanner scan= new Scanner(System.in);
        System.out.println("sayı gir");
         int sayi= scan.nextInt();

         if(sayi>=20){
             System.out.println("yanlış girdiniz");
         }
    }
}
