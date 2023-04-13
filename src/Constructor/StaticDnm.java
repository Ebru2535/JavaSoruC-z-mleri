package Constructor;

public class StaticDnm {
    static int sayi=20;
    int yas= 40;

    public StaticDnm(){  // constructuor var boş parametresiz
        sayi++;
        yas=10;
    }

    public static int method1(){  // method var
        return 2*sayi;
    }

    public static void main(String[] args) {  // bu clas da iki tane obje oluşturulmuş
        StaticDnm obj1= new StaticDnm();
        StaticDnm obj2=new StaticDnm();
        int sonuc= obj2.method1();

        System.out.println(obj2.yas+","+obj2.sayi+","+sonuc);



    }


}


