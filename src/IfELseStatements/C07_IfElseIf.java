package IfELseStatements;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {
        //kullnıcının  klıo ve boyunuun isteyın
        // vücut kıtle endeksının hesaplayın (kilo*10000/(boy*boy))
        // "      "       " 30 veya daha buyukse obez,
        // 25 30 arası kilolu
        // 20 25 arası nıormal
        // 20 den kuukse zayıf yazdır
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kilonuzu griniz");

        double kilo = scan.nextDouble();
        System.out.println("lütfen cm olarak boyunuzu gitnix");
        double boy= scan.nextDouble();
        double vke = kilo*10000/(boy * boy);

        System.out.println("vücut kitle endeksiniz :" + vke);
        if(vke>=30) System.out.println("obezsınız");
        else if (vke>=25) System.out.println("kiloluusunuz");
        else if (vke>=20) System.out.println("normalsınız");
        else System.out.println("zayıfsınız");


    }
}
