package day10_stringManipulations;

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
}
