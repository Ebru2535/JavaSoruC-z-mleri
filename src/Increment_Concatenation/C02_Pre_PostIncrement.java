package Increment_Concatenation;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {

        int a= 10;
        int b= a++;
        int c= ++a;

        System.out.println(a + ","+ b + ","+ c); //12 10 12

        int x= 20;
        int y= ++x;
        int z=y++;

        System.out.println(x+","+ y +","+z);// 21 22 21


    }
}
