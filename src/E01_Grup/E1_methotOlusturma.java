package E01_Grup;

public class E1_methotOlusturma {
    public static void main(String[] args) {
        toplama(5,10);       //15
       int sonuc= toopla(5,7);
        System.out.println(sonuc); // 12

    }
    public static void toplama(int sayi1,int sayi2){
        System.out.println(sayi1+sayi2);

    }
    public static int toopla(int a,int b){
        return a+b ;
    }
}
