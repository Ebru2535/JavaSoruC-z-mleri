package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


    /*Soru : Kullanicidan toplanmak uzere sayilar
    // isteyin toplam 500 olur veya gecerse
    //toplami yazdirin.

     */
    Scanner scan=new Scanner(System.in);
    //int sayı=1;
    int toplam1=0;

     while (true){
        System.out.println("Toplamak üzere sayılar girinniz");
        int sayi=scan.nextInt();
        toplam1+=sayi;
        if (toplam1>=500){
            break;
        }
    }
     System.out.println("Girdiğiniz sayıların toplamı : "+toplam1);

        System.out.println("----------");

    int toplam=0;
    int girilenSayi=0;
    int girilenSayıAdedi=0;

     while (toplam<500){
        System.out.println("Lütfen toplanmak üzere sayılar giriniz");
        girilenSayi=scan.nextInt();
        toplam+=girilenSayi;
        girilenSayıAdedi++;

    }
     System.out.println("toplam "+ girilenSayıAdedi+ "adet sayi girdiniz"+ toplam);

}
}

