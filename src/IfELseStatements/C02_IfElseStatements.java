package IfELseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        /* kullnıcıdan bir üçgenın 3 kenruzunluğunu alın,
        üçgen ikiz kenar ise "İkizkenar üçgen " yazdır, değilse "ikizkenar değil" yazıdırın.
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if(kenar1==kenar2 && kenar1!=kenar3 && kenar2>0 && kenar3>0){
            System.out.println("ikizkenar üçgen");
        }else{
            System.out.println("iizkenar değil");
        }
    }
}
