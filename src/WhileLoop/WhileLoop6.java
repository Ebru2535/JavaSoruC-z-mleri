package WhileLoop;

import java.util.Scanner;

public class WhileLoop6 {

    /*
    Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı ve üssünü giriniz");
        int sayı= scanner.nextInt();
        int üs= scanner.nextInt();
        UssuCagir(sayı,üs);

    }

  public static void UssuCagir(int a,int b) {
        int carpim=1;
        while (b>0){
            carpim*=a;
             b--;
        }
      System.out.println(carpim);
    }
}