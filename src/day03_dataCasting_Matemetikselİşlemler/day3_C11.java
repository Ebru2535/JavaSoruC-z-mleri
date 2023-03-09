package day03_dataCasting_Matemetikselİşlemler;

public class day3_C11 {
    public static void main(String[] args) {
        double dbl= 35.8;
                int sayı=(int)dbl;
        System.out.println(sayı);

        byte byt=(byte)sayı ;
        System.out.println(byt);
        sayı=130;
        byt=(byte)sayı;// int daa kapsamlı old.için otomatik atama yapmaz bizden müdahele ister
        System.out.println("int 130'un' byt hali:"+byt);

        sayı=13000;
        byt =(byte)sayı; // int daha kapdamlı olduğu için direk atama yapmaz bizden müdahele ister.
        System.out.println("int 1300'nın byt hali:"+byt);
    }

}
