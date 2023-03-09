package day_kendim.my_works;

import java.util.Scanner;

public class E01_ceMber {
    public static void main(String[] args) {
        // çemberin çevresi
        // 2 x π x r
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen yarıcap giriniz");
      int yarıcap= scan.nextInt();
        System.out.println("Cemberin cevresi:"+2*3.14*yarıcap);

        // çmberin alanı A = π r²)
       System.out.println (" Cemberin alanı :"+3.14*(yarıcap*yarıcap));

    }
}
