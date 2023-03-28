package WhileLoop;

import java.util.Scanner;

public class WhileLoop4 {
    /* Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
    kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
    olusturun.

     */
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen sayı ve üssünü girniz");
      int girilenSayi=scanner.nextInt();
      int üsSayi= scanner.nextInt();
      ussunuBulma(girilenSayi,üsSayi);

    }

    private static void ussunuBulma(int sayı,int üs) {
        int carpım=1;
        while (üs!=0){
            carpım*=sayı;
            üs--;
        }
        System.out.println(carpım);
    }
}
