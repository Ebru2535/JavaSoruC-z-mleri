package ifStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        /*kullanıcıdan bir 3genın 3 kenar uzunluğunu alın,
        üçgen eşkenar ise"Eşkenar üücgen" yazdırınız.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        if(kenar1==kenar2 && kenar2==kenar3 && kenar2>0){
            System.out.println("eşkenarüçgen");
        }
    }
}
