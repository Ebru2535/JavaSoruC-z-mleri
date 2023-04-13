package Constructor;

public class Static {
    static int sayi=20;
    int yas= 40;

    public Static(){  // constructuor var boş parametresiz
        sayi++;
        yas=10;
    }

    public static int method1(){  // method var
        return 2*sayi;
    }

    public static void main(String[] args) {  // bu clas da iki tane obje oluşturulmuş
        Static obj1= new Static();
        Static obj2=new Static();
        int sonuc= obj2.method1();

        System.out.println(obj2.yas+","+obj2.sayi+","+sonuc);



    }


}
