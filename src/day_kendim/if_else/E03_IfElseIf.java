package day_kendim.if_else;

import java.util.Scanner;

public class E03_IfElseIf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("sayı gir");
        int a= scan.nextInt();
        if(a<0) {
            System.out.println("negatıf sayı");
        }else if(a<10){
            System.out.println(" a rakam");

        }else if(a<100){
            System.out.println("a iki basamaklı sayı");
        }else{
            System.out.println("büyük sayı");
        }
    }
}
