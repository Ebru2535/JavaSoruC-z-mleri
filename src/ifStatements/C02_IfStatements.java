package ifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        /*basit if cüümlelri kadun geri kalanından bağımsızdır
        sadece 1 satıra odaklanır
        o şart true ise if bady çalışır
        şart ffalse ise if bady çalışmaz.( KOD ÇALIŞIR)

         */
        // kullanıcıdan bir sayı alıp
        // pozitif ise pozitif sayı,
        // 100 ile 999 ararsında ise  " poztif 3 basamaklı sayı"
        // 3ile bölünebiliyosa "3 un katı"
        // birler basamağı 7 ise " mükemmel"
        //seceneklerden uygun olanı yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı= scan.nextInt();

       // pozitif ise pozitif sayı,
        if(0<sayı){
            System.out.println("pozitif sayı");
        }
       // 100 ile 999 ararsında ise  " poztif 3 basamaklı sayı"
        if(100<=sayı && 999<=sayı){
            System.out.println("pozitif 3 basamaklı sayı");
        }
       // 3ile bölünebiliyosa "3 un katı"
        if(sayı%3==0){
            System.out.println("3' un katı");
        }
        // birler basamağı 7 ise " mükemmel"
        if(sayı%10==7|| sayı%10==-7){
            System.out.println("Mükemmel");
        }
    }
}
