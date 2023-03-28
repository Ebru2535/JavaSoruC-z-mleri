package WhileLoop;

public class WhileLoop2 {
    public static void main(String[] args) {
        // While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun

        String metin= "Ebru cok yoruluyor";

        String sonuç = tersMetin(metin);
        String s = sonuç + ".";
        System.out.println(s);

    }

   public static String tersMetin(String str) {
        String tersmetin="";
        int metinUzunluk=str.length()-1;
        while (metinUzunluk>=0){
            tersmetin+=str.charAt(metinUzunluk);
            metinUzunluk--;
        }return tersmetin;
    }
}
