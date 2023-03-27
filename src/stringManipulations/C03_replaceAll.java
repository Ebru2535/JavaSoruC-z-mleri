package stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str= "Ja1va 56Guz,zel-dir";

        System.out.println(str.replace("1","")
                        .replace("5","")
                        .replace("6","")); // java guz,zel-dir

         str="Ja1va4 56G7uz,z9el-d0ir8";

         /* replace zaten istenen değişikliği verilen özelliğe uyan tüm değerler için yapar

          eger genellemeyı butun sayıları, butun spaceleri, butun özel karakterleri  gıbı genişlletmek istersek
          replaceAll kullanırız
           java bu genellemeleri yazabılmek ıcın regex tanımlamış
           \\ d: butun digitler

          */
     str=str.replaceAll("\\d","");
        System.out.println(str); // java guz,zel-dir

        // özel karakterlerden kurtulun
        System.out.println(str.replaceAll("\\W","")); // java guzeldır

        


    }
}
