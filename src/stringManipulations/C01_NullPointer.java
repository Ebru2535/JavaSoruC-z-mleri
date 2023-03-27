package stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1= "";
        String str2= "  ";
        String str3;
        String str4= null;

        System.out.println(str1.length()); //0
        System.out.println(str2.length()); //2

        System.out.println("str1.isEmpty() = " + str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        // null bir değer değil işaretcedir(null pointer)
        // null pointer : non primitive bir objenin oluşturulduğunu ancak
        // bilinçli olarak değer atanmadığını işaretler
        // strr 4 degeri nulldır cumlesi  yanlış
        // str4 null olraak işaretlenmiştir cümlesi doğru

        /* java bir variableyi oluşturp değğer atamasına izin verir
        bir varibleyı değer atamadan oluşturabilirsiniz ancak kullanmazsınız
        değer atanmayan bir variable i kullanmaya kalkarsanız
        java CTE verir

         null pointeeer ise bu variable  e bir değer atanmadığını
         ve bunun bilinçli bir terch  olduğunu javaa söyler
         dolayısıyla java kodların çalışmaya devam etmesine izin verir
          ancak değer atanmadğı için methotları kullanmaya çalışırsanız NullPOınerException verir
          */
        str4= null;
        // System.out.println(str4.length()); // nullpointerException
       // System.out.println("str4.substring(3,4) = " + str4.substring(3, 4));//nullpointerException

        System.out.println(str4); // null
        System.out.println(str4 + "ali can");// nullali can
        System.out.println(str4.concat("ali can")); //  nullpointerException
    }

    public static class C01_stringManpulation {
        public static void main(String[] args) {
            /* kullnıcıdan gunn isminigirmesini isteyın,
            girilen gun hafta ıcı birgun ise "şimdi çalışma xamaznı tatile .. gun var"
            seklınde hafta sınu tatılıne kac gun kaldığını yazdırın,
            giriilen gun hafta sonu ıse "şşimdi dinlenme zzzamannı" yazdırın
             */
            Scanner scan= new Scanner(System.in);
            System.out.println("lütfen gun smini giriniz");
            String girilenGun= scan.next();
            String kullanılacakGun= girilenGun.toLowerCase();


            /* string ifadeler case sensitive'dir
            kullanıcın pazar pazar PAzar .... gibi 32 şeklinde yazma ihtimali
             */
            switch (kullanılacakGun){
                case "pazartesi" :
                    System.out.println(girilenGun + "çalışma zamanı, tatile 5 gun var");
                    break;
                case "salı" :
                    System.out.println(girilenGun + "calışma zamanı, tatile 4 gun var");
                    break;
                case "çarşamba" :
                    System.out.println(girilenGun + "calışma zamanı, tatile 3 gun var");
                    break;
                case "perşembe" :
                    System.out.println(girilenGun + "calışma zamanı, tatile 2 gun var");
                    break;
                case "cuma" :
                    System.out.println(girilenGun + "calışma zamanı, tatile 1 gun var");
                    break;
                case "cumartesi" :
                case "pazar" :
                    System.out.println("şimdi dinlenme zamanı");
                default:
                    System.out.println("yanlıs gunu ismi");

            }
        }

        public static class C02_toUppercaseLocale {
            public static void main(String[] args) {
                String str = "JAVA CANDIR ";
                System.out.println(str.toLowerCase());// java candir

                str= str.toLowerCase(Locale.forLanguageTag("TR"));
                System.out.println(str); // java candır

                 str="sevgiinsanı hayata bağlar";
                System.out.println(str.toUpperCase());
                System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

            }
        }
    }
}
