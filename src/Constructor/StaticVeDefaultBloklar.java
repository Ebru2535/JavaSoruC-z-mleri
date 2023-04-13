package Constructor;

public class StaticVeDefaultBloklar {
    public static void main(String[] args) {
        StaticVeDefaultBloklar dnm= new StaticVeDefaultBloklar();   // bir obje oluşrucam default  blok çalışması için;
                                                                    // static bloktan sonra default bloku çalıştırdı
        System.out.println("main method çalıştı");
    }

    static {
        System.out.println("static blok çalıştı"); // sttaic blok clas run edildiği zamn herşeyden önce calışır.
                                                  // önce static blok çalıştı  yazar sonra da  main methot çalıştı yazacak7
        }

    {
        System.out.println("default blok çalıştı");  // bir obje oluşturmadığım çin defaut blok çalışmadı
    }


   // default blok obje yoksa çalışmıyor
    // önce static  çalışır eğer birden fazla sttaic blok varsa üstten ağaşı doğru sıralanır
}
