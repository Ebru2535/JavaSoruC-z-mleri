package day09_stringManipulation;

public class C07_IlkTest {
    public static void main(String[] args) {

        // gittiiğimiz web sayfasından aldığımız
        // string arama sonuclarında
        // arama sayısının 50 den fazla olduğunu test edin

        String input= "1-48 of 87 results for \"nutella\"";

        int indexOf= input.indexOf("of");
        int indexResults= input.indexOf("results");

        String sonucSayisiString= input.substring(indexOf+3,indexResults-1);


        // arama sayısının 50 den fazla olduğunu test edin
        int sonucSayisiInt= Integer.parseInt(sonucSayisiString);

        if(sonucSayisiInt>50){
            System.out.println("nutella arama testi PASSED");
        }else{
            System.out.println("istenen kadar sonuc yok,Nutella arama testi FAiLed");
        }

    }
}
