package ifStatements;

import java.util.Scanner;

public class C06_İfElse {
    public static void main(String[] args) {
       // Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
       // kucukse “Maalesef kaldin” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not= scan.nextDouble();
        if(not>=50 && not<=100){
            System.out.println("sınıfı gectın");
        }else {
            System.out.println("malesef kaldın");
        }
    }
}
