package IfELseStatements.if_else;

import java.util.Scanner;

public class E01_IFElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");

        char ilkHarf=scan.next().charAt(0);
        if(ilkHarf>='a' && ilkHarf<='z'){
            System.out.println(Character.toUpperCase(ilkHarf));
        }else{
            System.out.println("normal");
        }


    }
}
