package Socrative.Deneme;

import java.util.Scanner;

public class C01_soru {
    public static void main(String[] args) {
        /*
        Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
tamsayilari yazdirin, sira
- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
yazdirin
         */

        // kullanıcdan p. sayı al
        //

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütefen bir saı gir");
        int girilenSayı= scanner.nextInt();

        for (int i = 1; i <=girilenSayı ; i++) {
           if(i%3==0 && i%5==0) {
               System.out.print(" fiizbuz");
           } else if (i%3==0) {
               System.out.print(" fizz");
           } else if (i%5==0) {
               System.out.print(" buzzz");
           }else {
               System.out.print(" "+i);
           }


        }
    }
}
