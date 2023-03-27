package IfELseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        // kullnıcıdan bir karakter girmesini isteyin
        // girilen karakterin büyük arf olup olmadığını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenKarakter= scan.next().charAt(0);

        if(girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("girilen harf büyük harf");
        }else {
            System.out.println("girilen harf büyük harf değil");
        }

    }
}
