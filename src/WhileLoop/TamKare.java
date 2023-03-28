package WhileLoop;

import java.util.Scanner;

public class TamKare {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
bulunuz, tamkare ise true değilse false yazdırınız.
Ornek : input : 16, output: 4
         */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayı = scanner.nextInt();

        boolean tamKareMi = false;

        for (int i = 1; i <= sayı; i++) {
            if (i * i == sayı) {
                tamKareMi = true;
                break;
            }
        }
        if (tamKareMi) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayı = scanner.nextInt();
        int sayac=0;

        for (int i = 1; i <sayı ; i++) {
          if(i*i==sayı){
              sayac++;
              System.out.print(i);
          }
        }
        if(sayac==0){
            System.out.println("  false");
        }else {
            System.out.println("  true "  );
        }
    }
}




