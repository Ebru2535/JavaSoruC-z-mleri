package forLoop;

public class E01_for {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        int sayı = 4;
        int faktOriyel = 1;
        // / Or : 6! = loop başlamdan once buu yazıdr
        System.out.print(sayı+"!" +" = ");
        for (int i = sayı; i >=1 ; i--) {
            faktOriyel*=i;
            if(i!=1){
                System.out.print(i+ " * ");
            }else {
                System.out.print(i+ " ");
            }

        }
        System.out.print(" = "+ faktOriyel);
    }


}
