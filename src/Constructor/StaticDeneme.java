package Constructor;

public class StaticDeneme {
    static int sayi=20;
    int yas=40;
    static String okul="ITU";

    public StaticDeneme(int a,int b,String c){
        this.sayi=a;
        this.yas=b;
        this.okul=c;

    }
    public static void method1(StaticDeneme dnm){
        System.out.println("sayı: " + dnm.sayi  +" " +"yas :" + dnm.yas+ " "  + "okul: " + dnm.okul);
    }
    public static void main(String[]args){
        StaticDeneme obj1=new StaticDeneme(20,30,"ODTü");
        StaticDeneme obj2=new StaticDeneme(15,25,"MArmara");
        method1(obj1);
        method1(obj2);

    }
}
