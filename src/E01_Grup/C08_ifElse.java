package E01_Grup;

import java.util.Scanner;

public class C08_ifElse {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if(krk>='A'&& krk<='Z'){
            System.out.println("büyük harf");
        }else {
            System.out.println("büyük harf değildir");
        }
    }
}
