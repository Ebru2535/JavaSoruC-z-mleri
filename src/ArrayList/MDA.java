package ArrayList;

public class MDA {
    public static void main(String[] args) {

        /*
            Soru 1-Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir method olusturun.
         */

            int[][] arr = {{2, 5, 6, 8}, {1, 3, 4, 9}, {3, 5, 7, 6, 8}};

            ciftSayilariTopla(arr);

        }

        private static void ciftSayilariTopla(int[][] arr) {
            int toplam = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {

                    if (arr[i][j] % 2 == 0) {
                        toplam += arr[i][j];
                    }
                }
            }
            System.out.print(toplam);
        }
    }

