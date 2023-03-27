package forLoop;

import java.util.Scanner;

public class E05_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen 20 den küçük bir tamsayı griniz");
        int girilenSayi= scanner.nextInt();
        int faktOryel=1;

        System.out.print(girilenSayi+" ! = ");

        for (int i = girilenSayi; i>=1; i--) {
            faktOryel*=i;
            if(i>1){
                System.out.print(i +" * ");

            }else {
                System.out.print(i+" ");
            }
        }
        System.out.print(" = " +faktOryel);


    }
}
