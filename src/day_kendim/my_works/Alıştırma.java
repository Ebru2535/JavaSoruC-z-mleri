package day_kendim.my_works;

public class Alıştırma {

    public static void main(String[] args) {

        // kullanıcıdN 20 DEN KÜÇÜK BİR SAYI AL
        // FAKTÖRYLEI HESAPLA

        int a=5;
        int faktoryle=1;

        for (int i = a; i >=1 ; i--) {
            faktoryle*=i;


        }
        System.out.println(a+"!="+faktoryle);

    }
}
