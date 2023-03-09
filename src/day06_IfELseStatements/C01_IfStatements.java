package day06_IfELseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
    // soru- kullanıcıdan bir üçgenin 3 kenar uzuunluğuu alın,
        // ,çgen eşkenar üçge ise "eşkenar üçgen" yazdırın,
        //değilse "eŞKENAR DEĞİL" YAZDIRIN
        Scanner scan = new Scanner(System.in);
        System.out.println(" üçgenin kenar uzunluklarını giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
         if(kenar2== kenar1 && kenar1==kenar3 && kenar3>0){
        System.out.println("Eşkenar Üçgen");
        }else {
            System.out.println("Eşkenar Değil");
        }
         /* if ile baslyan bir kod else ile bitiyosa input
          un tüm değerlerini kapsar. yani her deper için mutlaka bir body çalışır
          */

    }}

