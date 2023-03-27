package forLoop;

public class E07_replace {
    public static void main(String[] args) {
          String str="Java Candir";
          str=str.replace("C","e");     //Java eandir
          str= str.replaceFirst("a","e");// Jeva eandir
          System.out.println(str);

        System.out.println(" ");
        String str1="e125bRuhfjdkı98";
        str1=str1.replaceAll("\\d","f"); // efffbRuhfjdkıff
        System.out.println(str1);
        System.out.println("");

      String ebru= "Ebru123Altun123";
      ebru=ebru.replaceAll("\\D","k");
        System.out.println(ebru);
    }
}
