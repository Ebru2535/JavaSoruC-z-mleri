package forLoop;

public class strıng {
    public static void main(String[] args) {
        String str=" ebru basaracaksın";

        String toplam="";

        for (int i = str.length()-1; i>=0 ; i--) {
           // toplam+=str.substring(i-1,i);
            toplam+=str.charAt(i);


        }
        System.out.println(toplam);
    }
}
