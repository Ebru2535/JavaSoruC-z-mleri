package IfELseStatements.if_else;

import java.util.Scanner;

public class E02_IfElseIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3= scan.nextInt();

        if(k1<=0 || k2<=0 || k3<=0){
            System.out.println("gecersiz not");
        }else if (k1==k2 && k2==k3){
            System.out.println("eskenar ucgen");
        }else{
            System.out.println("esknar değil");
        }
    }
}
