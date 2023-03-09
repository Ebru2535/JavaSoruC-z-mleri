package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {
         int sayı= 20;
          // saıyyı 3 artırın

           sayı = sayı+3;
           sayı +=3;
            sayı++;
            sayı++;
            sayı++;

        System.out.println(sayı); //29

        // saıynın değerini 2 azaltın
         sayı= sayı- 2;
         sayı -=2;
         sayı--;
         sayı--;
        System.out.println(sayı); // 23

        sayı=10;
        // sayının değerni 1 azaltın ve yazdırın
        sayı --;
        System.out.println(sayı);

        sayı =10;
        --sayı;

       // sayıyı once yazdırın, sonra 1 azalatın

        sayı=10;
        sayı++; // saıyı bir artırır
        ++sayı; // sayıyı bir artırır.
        System.out.println(sayı); //12

        sayı=10;
        System.out.println(sayı++);
        // javada aynı satırda iki işlem olduğundan sıralama yapar
        // eger ++ variable'dan sonra ise artırma işlemini sonra yapar
        //bu durumda once yazdırma, sonra artırmaişlemi yapar
        System.out.println(sayı); // 11


        sayı=10;
        System.out.println(++sayı); // 11
        // ++variable dan once ise artıma işlemini önce yapar
        // bu durumda java önce artıma sonra yazdırma işlemni yapar

        System.out.println(sayı); // 11











    }

    }






































