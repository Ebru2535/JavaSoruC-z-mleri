package day_kendim.if_else;

import java.util.Scanner;

public class E06_IfElse {

    public static void main(String[] args) {
      // 3 sayı gir büyük olabu  yazdır
        Scanner scan= new Scanner(System.in);
        System.out.println("lüften 3 pozitf tamsayı giriniz");
        int sayı1= scan.nextInt();
        int sayı2= scan.nextInt();
        int sayı3= scan.nextInt();

        if(sayı1>sayı3 && sayı1>sayı2 &&sayı1>0){
            System.out.println("sayı1 büyük sayı");
        }else if(sayı2>sayı1 && sayı2>sayı1){
            System.out.println("sayı2 büyük sayı");
        }else if(sayı3>sayı2 && sayı3>sayı1){
            System.out.println("sayı3 büüyk sayı");
        }



    }
}
