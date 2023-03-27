package MethotOlusturma;

public class methot {
    public static void main(String[] args) {
        String str="Bugün hava cok güzel";
        System.out.println(str.substring(0,2)); // Bu
        System.out.println(topla(5, 7));    // 12

        System.out.println(sehirDöndür());  // ankara
        int toplam=topla2(3,4,5);
        System.out.println(toplam);
    }

    public static String sehirDöndür() {
        return "Ankara";
    }

    public static void ekle(){
        System.out.println("eklendi");
    }
    public static void sil(){
        System.out.println("silindi");
    }
    public static void güncelle(){
        System.out.println("güncellendi");
    }
    public static int topla(int sayı1,int sayı2){
        return sayı1+sayı2;
    }
    public static int topla2(int...sayılar){
        int toplam=0;
        for (int i = 0; i <=sayılar.length; i++) {
            toplam+=i;

        }return toplam;
    }

}
