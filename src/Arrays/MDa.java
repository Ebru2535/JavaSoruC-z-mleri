package Arrays;

public class MDa {
    // Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
    //method olusturun.

    public static void main(String[] args) {
        int [][]arr={{3,2,6},{2,4,8,2,1}};
        ciftSayıtopla(arr);

    }

  public static void ciftSayıtopla(int[][]arr) {
        int toplam=0;
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              if(arr[i][j]%2==0){
                  toplam+=arr[i][j];

              }


          }
      }

      System.out.println(toplam);

    }
}
