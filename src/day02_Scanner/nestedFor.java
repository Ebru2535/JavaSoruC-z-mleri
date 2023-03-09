package day02_Scanner;

public class nestedFor {
    public static void main(String[] args) {
        int sembol=9;//Yıldız sembolümüzün program başlangıçında, 9 tane yıldız yazdıracağını belirtiriz.

        for (int i = 0; i <9 ; i++) {

            for (int j = 0; j <sembol ; j++) {

                System.out.print("*");
            }
            System.out.println("");
            sembol--;
        }



        int satirSayisi=4;
        int sutunSayisi=8;

        int sembol1=8;    //Yıldız sembolümüzün program başlangıçında, 9 tane yıldız yazdıracağını belirtiriz.

        for (int i = 0; i <satirSayisi ; i++) {

            for (int j = 0; j <sutunSayisi ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
            sutunSayisi-=2;
        }





    }
}
