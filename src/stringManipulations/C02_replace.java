package stringManipulations;

public class C02_replace {
    public static void main(String[] args) {
        String str= "Java ogren, adana ye :)";

        str.replace('a','A'); // jAvA ogren, AdAnA ye

        System.out.println(str.replace("","")); // javaogren, adanaye:

        System.out.println(str.replace("Java","yazılım")); // yazılım ogren , adana ye
        // replace : değiştirmek demek

        String telefon= "555 3451234";
        telefon.replace("555","532"); // 532 345123
        telefon.replace('3','7'); // 555 741274

        // aşagıdakı arama sonucunn 10 bınden fazla olduğunu test edın

        String sonuc= "1-16 of over 100,000 results for \"apple\" ";
         int indexOver= sonuc.indexOf("over");
         int indexResults=sonuc.indexOf("results");

         String sonucSayisiStr= sonuc.substring(indexOver+5,indexResults-1);
        System.out.println(sonucSayisiStr); //100 000

        sonucSayisiStr= sonucSayisiStr.replace(",",""); //100000
        System.out.println(sonucSayisiStr);

        int sonucSayısıInt= Integer.parseInt(sonucSayisiStr);// string 100000 i int 100000 e cevirir

        if(sonucSayısıInt>10000){
            System.out.println("arama sonnunc testi PASSED");
        }else {
            System.out.println("arama sonuc testi failed");
        }





    }
}
