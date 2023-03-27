package ifStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        /*
          kullanıcıdan bir harf alın, harfile başlayan bir ay varsa yazdırın.
         NOT: Büyük harf, küçük harf hassasiyeti olmasın.
         Kullanıcı o veya O yazdığında output Ocak olsun
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yazdrmak istediğiniz lk ayın harfını girin");
        char ilkHarf= scan.next().charAt(0);
        if(ilkHarf=='o'||ilkHarf=='O')System.out.println("Ocak");
        if(ilkHarf=='s'||ilkHarf=='S')System.out.println("subat");
        if(ilkHarf=='h'||ilkHarf=='H')System.out.println("Haziran");
    }
}
