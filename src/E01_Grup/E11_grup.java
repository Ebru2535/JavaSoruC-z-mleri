package E01_Grup;

import java.util.Scanner;

public class E11_grup {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int girilenSayi= scan.nextInt();
        int rakamalrToplami=0;

         while (girilenSayi>0){
            rakamalrToplami+= girilenSayi%10;
            girilenSayi/=10;


         }
        System.out.println(rakamalrToplami);





    }
}
