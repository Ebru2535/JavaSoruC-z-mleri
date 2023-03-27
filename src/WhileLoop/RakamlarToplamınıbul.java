package WhileLoop;

import java.util.Scanner;

public class RakamlarToplamınıbul {
    public static void main(String[] args) {
        // While loop kullanarak
        // kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen toplanmasını istediğiniz sayıları giriniz");
        int sayi= scan.nextInt();
        int rakamlarToplamı=0;


        while (sayi>0){
            rakamlarToplamı+= sayi%10;
            sayi/=10;

        }
        System.out.println("Rakamlar Toplamı : " +rakamlarToplamı);
    }
}
